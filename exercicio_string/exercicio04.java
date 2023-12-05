package exercicio_string;
import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
		Scanner inserir = new Scanner(System.in);
		
		System.out.print("Informe o seu texto: ");
		String texto = inserir.nextLine();
		String resultado = texto.toUpperCase();
		System.out.print("Texto em maiusculo: " + resultado);
	}
}