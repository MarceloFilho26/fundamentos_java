package exercicio_arrays;

public class exercicio01 {
    public static void main(String[] args) {
        int[] intArray = {2,5,46,12,34};
        int[] intArrayb = new int[5];

        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        for(int i = 4; i >= 0; i--) {
            System.out.print(intArray[i] + " ");
            intArrayb[4 - i] = intArray[i];
        }
    }
}
/*Programa em java que printa o intArray e o adiciona dentro de outro array porém reverso*/