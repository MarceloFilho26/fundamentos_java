package exercicio_while_for;

public class exercicio08 {
	public static void main(String[] args) {
		double r = 0;
		
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				r = i / 2;
				System.out.println(i + " = " + r);
			}else {
				r = 3 * i + 1;
				System.out.println(i + " = " + r);
			}
		}
	}	
}
