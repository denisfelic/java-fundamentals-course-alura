package aula2;

import aula2.Formulario.Genero;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.QUARTA;
		System.out.println(dia.equals(dia));
		System.out.println(dia == dia);
		System.out.println(dia.toString() + " - valor " +dia.getValor());
		System.out.println(dia.ordinal());
		
		//tbm da pra fazer com enum
		TbmAconteceEnum data = new TbmAconteceEnum(21,04,1997, DiaSemana.DOMINGO);
	
	
		Genero gen = Genero.FEMININO;
		Formulario pessoa = new Formulario();
		pessoa.setGenero(gen);
		System.out.println(pessoa.getGenero());
		System.out.println(gen.getValor());
	}
}
