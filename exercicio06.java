//6. Dado um array, remova os valores duplicados e exiba o novo array sem repetições. 
import java.util.Arrays;
import java.util.LinkedHashSet;

public class exercicio06 {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 1, 10 }; // Exemplo de array com duplicatas

        int[] semDuplicatas = removerDuplicatas(numeros);

        System.out.println("Array sem duplicatas: " + Arrays.toString(semDuplicatas));
    }

    public static int[] removerDuplicatas(int[] numeros) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : numeros) {
            set.add(num);
        }

        int[] resultado = new int[set.size()];
        int i = 0;
        for (int num : set) {
            resultado[i++] = num;
        }

        return resultado;
    }
}
