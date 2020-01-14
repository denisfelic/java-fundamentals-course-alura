package basics;

public class Exeptions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println(c);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println("Deu merda!!");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		String name = "mmm";
		
		carregarString(name );
		carregarOutra(null);
	}

	public static void carregarString(String str) throws Exception{
		if (str != null && str.length() > 0) {
			System.out.println("\nSeu nome é: "+ str);
		}
		else {
			throw new Exception("Deu ruim no primeiro metodo");
		}
	}
	public static void carregarOutra(String str) {
		if (str != null && str.length() > 0) {
			System.out.println("yiyr: "+ str);
		}
		else {
			throw new DenocaExeption("Deu ruim no outro metodo");
		}
	}
}
