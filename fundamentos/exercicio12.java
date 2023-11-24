package fundamentos;
import java.util.Scanner;

public class exercicio12 {
	public static void main(String[] args) {
		Scanner inserir = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		double num1 = inserir.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double num2 = inserir.nextDouble();
		
		double media = (num1 + num2) / 2;
		
		System.out.println("A media do aluno equivale a "+ media);
		inserir.close();
	}
}
