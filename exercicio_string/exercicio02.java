package exercicio_string;
import java.util.Scanner;
import java.util.StringTokenizer;

public class exercicio02 {
public static void main(String[] args) {
	Scanner inserir = new Scanner(System.in);
	
	System.out.print("Informe seu texto: ");
	StringTokenizer texto = new StringTokenizer(inserir.nextLine());
	System.out.print(texto.countTokens());
	
	}
}
