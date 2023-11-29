package exercicio_while_for;

public class exercicio02 {
	public static void main(String[] args) {
		int i = 1;
		
		System.out.println("Os numeros impares sao: ");
		while (i <= 100) {
			System.out.print(i % 2 == 1 ? i + " " : " ");
			i++;
		}
	}
}

//Programa que mostra todos números ímpares de 1 até 100