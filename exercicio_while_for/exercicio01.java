package exercicio_while_for;
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
/*Programa em Java que calcula a média das
notas de uma turma Escreva um programa
que pergunte ao usuário quantos alunos tem
na sala dele. Em seguida, através de um laço while, pede
ao usuário para que entre com as notas de
todos os alunos da sala, um por vez.
Por fim, o programa mostra a média,
aritmética, da turma.*/