//9. Dado um array com números positivos e negativos, encontre o subarray com a maior soma. 
//Exemplo: 
//Entrada: [-2,1,-3,4,-1,2,1,-5,4]   
//Saída: 6 (subarray [4,-1,2,1]) 
public class exercicio09 {
    public static void main(String[] args) {
        int[] numeros = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // Exemplo de array

        int maxSoma = encontrarMaxSubarraySoma(numeros);

        System.out.println("A maior soma de subarray é: " + maxSoma);
    }

    public static int encontrarMaxSubarraySoma(int[] numeros) {
        int maxAtual = numeros[0];
        int maxGlobal = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            maxAtual = Math.max(numeros[i], maxAtual + numeros[i]);
            maxGlobal = Math.max(maxGlobal, maxAtual);
        }

        return maxGlobal;
    }
}
