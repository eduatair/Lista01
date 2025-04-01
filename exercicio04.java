//4. Crie um programa que inverta a ordem dos elementos de um array sem usar uma nova estrutura de dados auxiliar. 
public class exercicio04 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Exemplo de array
        
        inverterArray(numeros);
        
        System.out.println("Array invertido:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
    
    public static void inverterArray(int[] numeros) {
        int n = numeros.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[n - 1 - i];
            numeros[n - 1 - i] = temp;
        }
    }
}
