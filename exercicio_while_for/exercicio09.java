package exercicio_while_for;
import java.util.Scanner;

public class exercicio09 {
	public static void main(String[] args) {
		Scanner inserir = new Scanner (System.in);
		int cont = 1;
		double soma_notas = 0;
		double media = 0;
		
		System.out.print("Informe a quantidade de alunos na sala: ");
		int alunos = inserir.nextInt();
		
		for (int i = 1; i <= alunos; i++) {
			System.out.print("Informe a " + cont++ + " nota: ");
			double notas = inserir.nextDouble();
			soma_notas += notas;
		}
		media = soma_notas / alunos;
		System.out.printf("A media da turma equivale a %.1f", media);
		inserir.close();
	}
}
/*Pograma que solicita a
quantidade de alunos de uma sala e
depois solicita uma nota para cada
aluno, imprimindo no final a média da
sala.*/