package leituras_arquivos_externos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jdk.nashorn.api.scripting.JSObject;

public class TesteLeitura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static void lerJSONtipo1() {
		// jeito 1
		System.out.println("21");
		String caminho = "/home/denis/Eclipse Workspace2/SistemaEstoque/JSON/Produtos.json";
		try {
			String arquivo = new String(Files.readAllBytes(Paths.get(caminho)));
			try {
				
				JSONObject produtosJson = new JSONObject(arquivo);
				JSONArray emails = produtosJson.getJSONArray("emails");
			
				System.out.println("Email - "+emails.get(0));
				String nome = (String) produtosJson.get("name");
				System.out.println("Nome:  "+nome);
				
				String sobreNome = (String) produtosJson.get("sobrenome");
				System.out.println("Sobrenome:  "+sobreNome);
				
				int idade = produtosJson.getInt("idade");
				System.out.println("Idade: "+idade);
				
				String telefone = (String) produtosJson.get("telefone");
				System.out.println("Telefone: "+telefone);
				
				JSONObject familia = produtosJson.getJSONObject("familia");
				
				System.out.println("Pai: " +familia.get("pai"));
				System.out.println("Mãe: " +familia.get("mae"));
				
				JSONArray filhos = produtosJson.getJSONArray("filhos");
				System.out.println("Filho 1 : "+filhos.get(0));
				
			} 
			catch (JSONException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
