    //7. Implemente um programa que rotacione os elementos do array k posições para a 
    //direita. Exemplo: 
    //Entrada: [1, 2, 3, 4, 5], k = 2   
    //Saída: [4, 5, 1, 2, 3] 
    import java.util.Arrays;

    public class exercicio07 {
        public static void main(String[] args) {
            int[] numeros = {1, 2, 3, 4, 5}; // Exemplo de array
            int k = 2; // Número de posições a rotacionar
            
            rotacionarArray(numeros, k);
            
            System.out.println("Array rotacionado: " + Arrays.toString(numeros));
        }
        
        public static void rotacionarArray(int[] numeros, int k) {
            int n = numeros.length;
            k = k % n; // Garante que k não seja maior que o tamanho do array
            
            reverter(numeros, 0, n - 1);
            reverter(numeros, 0, k - 1);
            reverter(numeros, k, n - 1);
        }
        
        private static void reverter(int[] numeros, int inicio, int fim) {
            while (inicio < fim) {
                int temp = numeros[inicio];
                numeros[inicio] = numeros[fim];
                numeros[fim] = temp;
                inicio++;
                fim--;
            }
        }
    }
