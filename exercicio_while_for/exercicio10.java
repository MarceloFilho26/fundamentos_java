package exercicio_while_for;
public class exercicio10 {
	public static void main(String[] args) {
		int mult_tres = 0;
		int mult_cinc = 0;
		int soma = 0;
		
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				mult_tres += i;
			}
			if (i % 5 == 0) {
				mult_cinc += i;
			}
			soma = mult_tres + mult_cinc;
		}
		System.out.println("A soma dos multiplos de 3 equivale a: "+ mult_tres);
		System.out.println("A soma dos multiplos de 5 equivale a: " + mult_cinc);
		System.out.println("A soma entre eles equivale a: " + soma);
	}
}
/*Programa que calcula a soma
dos multiplos de 3 e 5, no intervalo entre
1 e 20. No final, mostre a soma dos
multiplos de 3 e 5 e a soma total.*/