package leituras_arquivos_externos;

import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import interface_produto.InterfaceProduto;
import objetos.Contato;
import objetos.Estoque;
import objetos.Fornecedor;
import objetos.Produto;
import objetos.Telefone;

public class AtribuirObjetosJson {
	private static ArrayList arrayProdutos;

	public static void atribuirProdutosAoJSON(JSONArray produtosJson) {
		Estoque estoque = new Estoque();
		arrayProdutos = InterfaceProduto.array_produtos;

		// INICIO DO METODO
		
		JSONObject[] objeto = new JSONObject[produtosJson.length()];
		// tenta atribuir o parametro json para o objeto criado aqui no metodo tbm json
		try {
			for (int i = 0; i < produtosJson.length(); i++) {
				objeto[i] = (JSONObject) produtosJson.get(i);
			}

		} catch (

		JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			// faz a logica que quiser

			// System.out.println(objeto.get("peso"));
			for (int i = 0; i < objeto.length; i++) {
				Produto produtoMy = new Produto();
				

				String idProduto = objeto[i].getString("idProduto");
				produtoMy.setIdProduto(idProduto);
				
				String nomeProduto = objeto[i].getString("nomeProduto");
				produtoMy.setNome(nomeProduto);
				
				// DATA COMPRA OBJ
				JSONObject dataCompra = (JSONObject) objeto[i].get("dataCompra");
				
				String dataDaCompra = "";
				int dia = dataCompra.getInt("dia");
				dataDaCompra = dia+"/";
				
				int mes = dataCompra.getInt("mes");
				dataDaCompra += mes+"/";
				
				int ano = dataCompra.getInt("ano");
				dataDaCompra += ano;
				
				produtoMy.setDataCompra(dataDaCompra);
				
				
				String categoria = objeto[i].getString("categoria");
				produtoMy.setCategoria(categoria);

				double preco = objeto[i].getDouble("preco");
				produtoMy.setPreco(preco);

				String descricao = objeto[i].getString("descricao");
				produtoMy.setDescricao(descricao);

				String marca = objeto[i].getString("marca");
				produtoMy.setMarca(marca);
				
				double peso = objeto[i].getDouble("peso");
				produtoMy.setPeso(peso);

				String tipoPeso = objeto[i].getString("tipoPeso");
				produtoMy.setTipoPeso(tipoPeso);

				int codBarras = objeto[i].getInt("codBarras");
				produtoMy.setCodBarras(codBarras);
				
				String paisOrigem = objeto[i].getString("paisOrigem");
				produtoMy.setPaisOrigem(paisOrigem);

				// SAC
				JSONObject sac = (JSONObject) objeto[i].get("sac");
				
				JSONObject contato = (JSONObject) sac.get("contato");

				JSONArray telefone = contato.getJSONArray("telefone");
				Telefone[] tels = new Telefone[telefone.length()];
				String tel="";
				for (int j=0; j<telefone.length(); j++) {
					tel =  (String) telefone.getString(j);
					Telefone tell = new Telefone(tel, "Comercial");
					
					 tels[j] = tell;
					
				}
		 
				Contato mySac = new Contato();
				mySac.setTelefones(tels);
				
				//ADC EMAIL
				JSONArray email = contato.getJSONArray("email");
				
				String myEmail[] = new String[email.length()];
				for (int k=0;k<email.length();k++) {
					myEmail[k] = (String) email.get(0); 
				}
				mySac.setEmail(myEmail);
				produtoMy.setSac(mySac);
				
				// FORNECEDOR
				JSONObject fornecedor = (JSONObject) objeto[i].get("fornecedor");
				Fornecedor myFornecedor = new Fornecedor();

				String cnpj = fornecedor.getString("cnpj");
				myFornecedor.setCnpj(cnpj);
				
				String nomeEmpresa = fornecedor.getString("nomeEmpresa");
				myFornecedor.setNomeEmpresa(nomeEmpresa);

				String nomeResponsavel = fornecedor.getString("nomeResponsavel");
				myFornecedor.setNomeResponsavel(nomeResponsavel);
				
				//EMAIL FORNECEDOR
				JSONObject contatoFornecedor = (JSONObject) fornecedor.get("contato");
				Contato myContatoFornecedor = new Contato();
				
				
				JSONArray emailFornecedor = contatoFornecedor.getJSONArray("email");
			
				
				String emailF[] = new String[emailFornecedor.length()];
				for (int c1=0;c1<emailFornecedor.length(); c1++) {
					if (emailFornecedor == null) {
						emailF[c1] = "-";
					}
					else {
					emailF[c1]=  (String) emailFornecedor.get(c1);
					}
				}
				
				myContatoFornecedor.setEmail(emailF);

				
				//TELEFONE FORNECEDOR
				JSONArray telefoneFornecedor = contatoFornecedor.getJSONArray("telefone");
				
				Telefone[] telF = new Telefone[telefoneFornecedor.length()];

				String numF;
 				
				for(int c2=0;c2<telefoneFornecedor.length();c2++) {
					 numF = (String) telefoneFornecedor.getString(c2);
					 Telefone tell1 = new Telefone(numF, "Comercial");
					 telF[c2] = tell1;
				}
				myContatoFornecedor.setTelefones(telF);
				
				
				
				String ramo = fornecedor.getString("ramo");
				myFornecedor.setRamo(ramo);

				String produtosOferecido = fornecedor.getString("produtosOferecido");
				myFornecedor.setProdutosOferecidos(produtosOferecido);
				
				String idFornecedor = fornecedor.getString("idFornecedor");
				myFornecedor.setIdFornecedor(idFornecedor);
				
				produtoMy.setFornecedor(myFornecedor);
				
				arrayProdutos.add(produtoMy);
			}
			InterfaceProduto.array_produtos = arrayProdutos;
		//	System.out.println(InterfaceProduto.array_produtos.get(0));
			Scanner scan = new Scanner(System.in);
			System.out.println("Objeto cadastrado com sucesso!\n Pressione qualquer tecla para retornar ao menu anterior.");
			scan.nextLine();
			InterfaceProduto.interfaceProdutos();
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
