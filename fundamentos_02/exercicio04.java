package fundamentos_02;
import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner inserir = new Scanner(System.in);
		int i = 1;
		
		System.out.print("Informe um numero inteiro: ");
		int num = inserir.nextInt();
		
		System.out.println("Numeros impares:");
		while(i <= num){
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
			i++;
		}
		i = 1;
		System.out.println("\nNumeros pares:");
		while(i <= num) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
			i++;
		}
		inserir.close();
	}
}
