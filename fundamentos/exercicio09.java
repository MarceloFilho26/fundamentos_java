package fundamentos;
import java.util.Scanner;

public class exercicio09 {
	public static void main(String[] args) {
		Scanner inserir = new Scanner (System.in);
		
		System.out.print("Informe um numero: ");
		double num = inserir.nextDouble();
		System.out.println(num == 0 ? "Numero neutro" : num < 0 ? "Numero negativo." : "Numero positivo.");
		inserir.close();
	}
}