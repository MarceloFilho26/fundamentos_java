package exercicio_while_for;
import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner inserir = new Scanner(System.in);
		int i = 1;
		int impares = 0;
		int pares = 0;
		
		System.out.print("Informe um numero inteiro: ");
		int num = inserir.nextInt();
		System.out.println("Numeros impares:");
		while(i <= num){
			if (i % 2 != 0) {
				System.out.print(i + " ");
				impares++;
			}
			i++;
		}
		i = 1;
		System.out.println("\nNumeros pares:");
		while(i <= num) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				pares++;
			}
			i++;
		}
		System.out.println();
		System.out.print("\nQuantidade de numeros impares encontrados: " + impares);
		System.out.print("\nQuantidade de numeros pares encontrados: " + pares);
		inserir.close();
	}
}
//Programa em java que recebe um número inteiro e mostra os números pares e ímpares(separados), de 1 até esse inteiro.
