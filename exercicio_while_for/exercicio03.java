package exercicio_while_for;
public class exercicio03 {

	public static void main(String[] args) {
		int i = 1;
		
		System.out.println("Os numeros pares são: ");
		while (i <= 100) {
			System.out.print(i % 2 == 0 ? i + " " : " ");
			i++;
		}
	}
}
//Programa que mostra todos os números pares de 1 até 100