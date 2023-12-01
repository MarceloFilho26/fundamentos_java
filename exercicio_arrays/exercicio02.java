package exercicio_arrays;
public class exercicio02 {
    public static void main(String[] args) {
        int[] arrayNum = {87,68,52,5,49,83,45,12,64};
        int total = 0;
        for (int i : arrayNum){
            total += i;
        }
        System.out.printf("Total de elementos arrayNum: %d\n", total);
    }
}

/*Programa em java que percorre o array e faz a soma adicionando dentro de outra variável*/
