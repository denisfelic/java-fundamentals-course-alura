
public class TestaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			if (i > 10 && i < 95) {
				continue; //faz pular
			}
			System.out.println(i);
		}
	}

}
