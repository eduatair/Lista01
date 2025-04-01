//3. Preencha um array com 10 números e conte quantos são pares e quantos são ímpares.
public class exercicio03 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Exemplo de array com 10 números
        
        int pares = 0, impares = 0;
        
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}