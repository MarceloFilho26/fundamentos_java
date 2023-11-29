package fundamentos_02;
import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {
		Scanner inserir = new Scanner(System.in);
		int x = 10;
		
		for (;x != 1;) {
			if (x % 2 == 0) {
				x = x / 2;
			}else {
				x = 3 * x + 1;
			}
			System.out.print("O valor de x equivale a: " + x);
		}
	}
}
