package fundamentos;
import java.util.Scanner;

public class exercicio10 {
	public static void main(String[] args) {
		Scanner inserir = new Scanner(System.in);
				
		System.out.print("Informe o primeiro numero: ");
		double n1 = inserir.nextDouble();
		
		System.out.print("Informe o segundo numero: ");
		double n2 = inserir.nextDouble();
		
		System.out.print("Informe o terceiro numero: ");
		double n3 = inserir.nextDouble();
		
		if (n1 == n2 || n2 == n3 || n3 == n1) {
			System.out.println("Numeros iguais.");
		}else if(n1 > n2 && n1 > n3 && n2 > n3) {
			System.out.println("O maior " + n1 + " e o menor " + n3);
		}else if(n1 > n2 && n1 > n3 && n3 > n2) {
			System.out.println("O maior " + n1 + " e o menor " + n2);
		}else if(n2 > n1 && n2 > n3 && n1 > n3) {
			System.out.println("O maior " + n2 + " e o menor " + n3);
		}else if(n2 > n1 && n2 > n3 && n3 > n1) {
			System.out.println("O maior " + n2 + " e o menor " + n1);
		}else if(n3 > n1 && n3 > n2 && n1 > n2) {
			System.out.println("O maior " + n3 + " e o menor " + n2);
		}else if(n3 > n1 && n3 > n2 && n2 > n1) {
			System.out.println("O maior " + n3 + " e o menor " + n1);	
		}
		inserir.close();
	}	
}
