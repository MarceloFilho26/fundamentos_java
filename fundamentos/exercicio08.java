package fundamentos;
import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double resp = scanner.nextDouble();
		System.out.println(resp);
		scanner.close();
	}

}
