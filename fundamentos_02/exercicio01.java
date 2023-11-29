package fundamentos_02;
import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		Scanner inserir = new Scanner(System.in);
		int i = 1;
		int cont = 1;
		double notas = 0;
		
		System.out.print("Informe a quantidade de alunos na sala: ");
		int alunos = inserir.nextInt();
		
		while (i <= alunos) {
			System.out.print("Informe a "+ cont++ +" nota: ");
			double notas1 = inserir.nextDouble();
			notas += notas1;
			i++;
		}
		double media = notas / alunos;
		System.out.printf("A media da turma equivale a %.2f", media);
		inserir.close();
	}
}