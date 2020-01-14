
public class TestaString {
	public static void main(String[] args) {
		
		
		String a = "Alura"; //Objeto Literal e imutavel
		//String b = new String("b");
		
		a.toLowerCase(); //Imutavel, não acontece nada pois tenho de adicionar em outra para que haja mudanças.
		System.out.println(a);
		
		String b = a.toLowerCase();
		System.out.println(a);
		
		System.out.println(b);
		b = a.replaceFirst("a", "A");
		System.out.println(b);
		a = b.replaceAll("u", "U");
		System.out.println(a);
		
		char formatada = a.charAt(0);
		
		String abc = a.substring(1);
		System.out.println(abc);
		abc = a.repeat(5);
		System.out.println(abc);
		a = a.toLowerCase();
		System.out.println(a);
		abc = "ALURA";
		System.out.println(abc.hashCode());
		System.out.println(abc.length());
		String t = "Dedsad";
		System.out.println(t.length());
		
		
		String removeSpace = "   ";
		System.out.println(removeSpace.isEmpty());
		System.out.println(removeSpace.isBlank());
		System.out.println(removeSpace.length());
		removeSpace = "  denoca  ";
		System.out.println(abc+removeSpace+abc);
		String n = removeSpace.trim();
		System.out.println(abc+n+abc);
		System.out.println(abc.equals("ALURA"));
		System.out.println(abc.equals(n));
		abc = "aazlualurask,casfk";
		System.out.println(abc.contains("Alura"));
		System.out.println(abc.contains("alura"));
		abc = "alura";
		System.out.println(abc.indexOf("xyz"));
		System.out.println(abc.indexOf("ur"));
		
		String nome = "brasil";
		nome = nome.toUpperCase();
		System.out.println(nome);
			for (int i = nome.length(); i > 0; i--)
			System.out.print(nome.charAt(i-1));
			String letraAtual;
			nome = "brasil zil zil";
			System.out.println();
			for(int i=0; i< nome.length(); i++) {
				if(i%2 == 0) {
					letraAtual = Character.toString(nome.charAt(i)).toUpperCase();
					
				}else {
					letraAtual = Character.toString(nome.charAt(i)).toLowerCase();					
				}
				System.out.print(letraAtual);
			}
		
			System.out.println();
			System.out.println(0>>>8>>>4>>>3);
	}
	
}
