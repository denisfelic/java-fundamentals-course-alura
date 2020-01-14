package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

@WebServlet(name = "ShowUserServelet", urlPatterns = {"/ShowUserServelet"})
public class ShowUserServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //url
        //http://localhost:8080/MyFirstMVC/ShowUserServelet?user=denis&senha=1493&modo=html
        String pUser = request.getParameter("user");
        String pMode = request.getParameter("modo");
        String pSenha = request.getParameter("senha");
        String modo = request.getParameter("modo");
        System.out.println("User: " + pUser);
        System.out.println("Senha: " + pSenha);
        System.out.println("MODO: " + modo);
        String pagina = "/erro.jsp";
   
        if (pUser.equals("denis") && pSenha.equals("1493")) {
            Usuario user = new Usuario();
            user.setId(1);
            user.setName("Denis");
            user.setFullName("Denis Feliciano da Silva");
            user.setEmail("denisf.salles@gmail.com");
            request.setAttribute("Usuario", user);
       
            if (pMode.equals("html")) {
                pagina = "/ok.jsp";
            } 
            else {
                Gson json = new Gson();
                String resultado = json.toJson(user);
                request.setAttribute("UsuarioJSON", resultado);
                pagina = "/request.jsp";
            }
        }

        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher(pagina);
        dispatcher.forward(request, response);
    }

}
