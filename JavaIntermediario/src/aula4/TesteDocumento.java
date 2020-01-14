package aula4;

import aula1.Enum;

public class TesteDocumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (TipoDocumento doc : TipoDocumento.values()){
			System.out.println(doc+" - "+doc.geraNumeroTeste());
		}
		
		
		Pessoa pf = new Pessoa();
		pf.setTipoDoc(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumeroDoc(pf.getTipoDoc().geraNumeroTeste());
		System.out.println(pf.toString());
	
		Pessoa pj = new Pessoa();
		pj.setTipoDoc(Enum.valueOf(TipoDocumento.class, "C NPJ"));
		pj.setNumeroDoc(pj.getTipoDoc().geraNumeroTeste());
		System.out.println(pj.toString());
	}

}
