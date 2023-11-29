package exercicio_while_for;

public class exercicio05 {
	public static void main(String[] args) {
		
		System.out.println("Os numeros impares entre 1 e 50 sao: ");
		for (int i = 1; i < 50; i++) {
			System.out.print(i % 2 != 0 ? i + " " : " ");
		}
	}
}
//Programa que imprima na tela apenas os números ímpares entre 1 e 50.