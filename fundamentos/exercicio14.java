package fundamentos;
import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner inserir = new Scanner(System.in);
		
		int cont = 0;
		
		System.out.print("Informe o seu nome: ");
		String nome = inserir.next();
		System.out.print("Telefonou para a vitima? [1 - SIM] e [2 - NAO]: ");
		int resposta = inserir.nextInt();
		System.out.print("Este no local do crime? [1 - SIM] e [2 - NAO]: ");
		int resposta2 = inserir.nextInt();
		System.out.print("Mora perto da vitima? [1 - SIM] e [2 - NAO]: ");
		int resposta3 = inserir.nextInt();
		System.out.print("Devia para a vitima? [1 - SIM] e [2 - NAO]: ");
		int resposta4 = inserir.nextInt();
		System.out.print("Ja trabalhou com a vitima? [1 - SIM] e [2 - NAO]: ");
		int resposta5 = inserir.nextInt();
		
		if (resposta == 1){
			cont++;
		}if(resposta2 == 1){
			cont++;
		}if(resposta3 == 1) {
			cont++;
		}if(resposta4 == 1) {
			cont++;
		}if(resposta5 == 1) {
			cont++;
		}
		if (cont == 2){
			System.out.printf("%s suspeito!", nome);
		}else if(cont >=3 && cont <=4){
			System.out.printf("%s cumplice!", nome);
		}else if(cont == 5){
			System.out.printf("%s assassino!", nome);
		}else{
			System.out.printf("%s inocente!", nome);
		}
	}
}