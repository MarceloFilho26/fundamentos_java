package fundamentos;
import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner inserir = new Scanner(System.in);
		
		System.out.print("Informe seu sexo pela letra [M - masculino e F - Feminino]: ");
		char letra = inserir.next().charAt(0);
		
		if (letra == 'F' || letra == 'f'){
			System.out.println("Feminino!");
		}else if (letra == 'M' || letra == 'm'){
			System.out.println("Masculino!");
		}else{
			System.out.println("Valor invalido!");
		}
		inserir.close();
	}
}
