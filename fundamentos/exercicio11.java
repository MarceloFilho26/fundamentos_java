package fundamentos;
import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
		Scanner inserir = new Scanner(System.in);
		
		System.out.print("Informe o numero para saber o dia da semana: ");
		int num = inserir.nextInt();
		
		if (num <= 0 || num > 7){
			System.out.println("Valor invalido!");
		}else if (num == 1){
			System.out.println("Domingo.");
		}else if (num == 2){
			System.out.println("Segunda.");
		}else if (num == 3){
			System.out.println("Terca.");
		}else if (num == 4){
			System.out.println("Quarta.");
		}else if (num == 5){
			System.out.println("Quinta.");
		}else if (num == 6){
			System.out.println("Sexta.");
		}else if (num == 7){
			System.out.println("Sabado.");
		}
		inserir.close();
	}

}
