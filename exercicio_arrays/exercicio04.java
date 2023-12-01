package exercicio_arrays;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        int[] d = new int[10];
        int cont = 1;

        System.out.println("||----Adicione os valores no array A----||");
        for(int i = 0; i < a.length; i++){
            System.out.print("Informe o " + cont++ + " número: ");
            a[i] = inserir.nextInt();
        }

        System.out.println("||----Adicione os valores no array B----||");
        cont = 1;
        for(int i = 0; i < b.length; i++) {
            System.out.print("Informe o " + cont++ + " número: ");
            b[i] = inserir.nextInt();
        }

        System.out.println("||----Adicione os valores no array C----||");
        cont = 1;
        for(int i = 0; i < c.length; i++) {
            System.out.print("Informe o " + cont++ + " número: ");
            c[i] = inserir.nextInt();
        }

        System.out.println("||----Adicione os valores no array D----||");
        cont = 1;
        for(int i = 0; i < d.length; i++) {
            System.out.print("Informe o " + cont++ + " número: ");
            d[i] = inserir.nextInt();
        }

        System.out.println("Valores do array A: ");
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println("\nValores do array B: ");
        for(int i : b){
            System.out.print(i + " ");
        }
        System.out.println("\nValores do array C: ");
        for(int i : c){
            System.out.print(i + " ");
        }
        System.out.println("\nValores do array D: ");
        for(int i : d){
            System.out.print(i + " ");
        }
    }
}

/*Programa em java que pede ao usuário para adicionar valores dentro de cada array*/
