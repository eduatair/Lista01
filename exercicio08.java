
//8. Dado dois arrays ordenados, crie um terceiro array que contenha todos os 
//elementos ordenados. 
//Entrada: [1, 3, 5] e [2, 4, 6]   
//Saída: [1, 2, 3, 4, 5, 6] 
import java.util.Arrays;

public class exercicio08 {
    public static void main(String[] args) {
        int[] array1 = { 1, 3, 5 }; // Primeiro array ordenado
        int[] array2 = { 2, 4, 6 }; // Segundo array ordenado

        int[] resultado = mesclarArraysOrdenados(array1, array2);

        System.out.println("Array mesclado e ordenado: " + Arrays.toString(resultado));
    }

    public static int[] mesclarArraysOrdenados(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] resultado = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                resultado[k++] = arr1[i++];
            } else {
                resultado[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            resultado[k++] = arr1[i++];
        }

        while (j < n2) {
            resultado[k++] = arr2[j++];
        }

        return resultado;
    }
}
