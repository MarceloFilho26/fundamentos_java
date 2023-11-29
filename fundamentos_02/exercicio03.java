package fundamentos_02;
public class exercicio03 {

	public static void main(String[] args) {
		int i = 1;
		int impares = 100;
		
		while (i < impares) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}