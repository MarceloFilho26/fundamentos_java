package exercicio_arrays;
public class exercicio03 {
    public static void main(String[] args) {
        int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
        int[] arrayDois = {43,42,4,8,55,21,2,45};
        if(arrayDois.length >= 8){
            System.out.println("Tamanho do ArrayDois - Maior ou igual que 8!");
        }else{
            System.out.println("Tamanho do ArrayDois - Menor que 8!");
        }
        System.out.println("\nTamanho do ArrayUm = " + arrayUm.length);
    }
}
/*Programa em java que testa o tamanho do arrayDois para saber se é maior,
igual ou menor que 8 e por fim printa a quantidade
arrayUm */
