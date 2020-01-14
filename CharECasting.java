
public class CharECasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char mychar = '2';
		System.out.println(mychar);
		System.out.println(mychar + 2);
		mychar =  (char) (mychar + 2);
		System.out.println(mychar);
		
		mychar = 66;
		System.out.println(mychar);
		mychar = 6+6;
		System.out.println(mychar);
		mychar = (char)  (23 + mychar);
		System.out.println(mychar);
		
		//char basicamente é um numero inteiro
		
		
		String nome = "d";
		//char charname = (char) nome; não é permitido da erro
		char charname = 64;
		System.out.println(charname);
		nome = String.valueOf(charname);
		System.out.println(nome);
		nome = String.valueOf((int)charname);
		System.out.println(nome);
		
		mychar = 35;
		System.out.println(mychar);
		mychar = +35;
		System.out.println(mychar);
		
		nome = nome.valueOf(nome);
		System.out.println(nome);
		nome = nome.valueOf(mychar);
		System.out.println(nome);
		long longNumero = 1;
		nome = nome.valueOf(longNumero);
		System.out.println(nome);
		nome = "Denoca";
		nome = nome.valueOf(nome);
		System.out.println(nome);
	}

}
