package leituras_arquivos_externos;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jdk.nashorn.api.scripting.JSObject;
import objetos.Cliente;
import objetos.Fornecedor;
import objetos.Produto;

public class LeituraJson {
	private Produto[] produtos;
	private Cliente[] clientes;
	private Fornecedor[] fornecedors;
	private static final String URL_PRODUTOS = "/home/denis/Eclipse Workspace2/SistemaEstoque/JSON/Produtos.json";

	public static void main(String[] args) {
		
	}
	private static void lerProdutoXML() {

	}
	

	public static void lerProdutoJSON(String caminhoUser) {
		JSONObject produtosJsonObject  = new JSONObject();
		
		try {
			String localArquivo = new String(Files.readAllBytes(Paths.get(caminhoUser)));
			try {
				JSONObject prodJson0 = new JSONObject(localArquivo);
				JSONArray produtosJson = new JSONArray();
				produtosJson = prodJson0.getJSONArray("prod");
				
				AtribuirObjetosJson.atribuirProdutosAoJSON(produtosJson);
				

			
			}
			catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void lerClienteXML() {

	}

	private void lerClienteJSON() {

	}

	private void lerFornecedorXML() {

	}

	private void lerFornecedorJSON() {

	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Fornecedor[] getFornecedors() {
		return fornecedors;
	}

	public void setFornecedors(Fornecedor[] fornecedors) {
		this.fornecedors = fornecedors;
	}

}
