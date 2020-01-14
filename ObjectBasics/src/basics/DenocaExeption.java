package basics;

public class DenocaExeption extends RuntimeException{

	public  DenocaExeption(String str){
		super("DENOCA"+str);
	}
}
