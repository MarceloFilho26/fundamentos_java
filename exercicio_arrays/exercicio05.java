package exercicio_arrays;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);
        double[] notas = new double[5];
        int cont = 1;
        double soma = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.print("Informe a " + cont++ + " nota: ");
            notas[i] = inserir.nextInt();
        }
        for(double i : notas){
            soma += i;
        }
        double media = soma / notas.length;
        System.out.print("A media da turma é de: " + media);
    }
}

/*Programa em java que solicita ao usuário notas de 5 alunos, guardar todas
no array e depois calcular a média e printar. */