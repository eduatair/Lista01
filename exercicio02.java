//2. Dado um array de números inteiros, calcule e exiba a média dos elementos. 
public class exercicio02 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50}; // Exemplo de array
        
        double media = calcularMedia(numeros);
        
        System.out.println("A média dos elementos do array é: " + media);
    }

    public static double calcularMedia(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio");
        }
        
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        
        return (double) soma / numeros.length;
    }
}