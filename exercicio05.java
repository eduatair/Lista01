   //5. Peça ao usuário um número e verifique se ele está presente no array. Exiba a posição caso esteja. 
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Exemplo de array
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se está no array: ");
        int numeroProcurado = scanner.nextInt();
        
        int posicao = buscarNumero(numeros, numeroProcurado);
        
        if (posicao != -1) {
            System.out.println("O número " + numeroProcurado + " está presente na posição " + posicao);
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado no array.");
        }
        
        scanner.close();
    }

    public static int buscarNumero(int[] numeros, int numero) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                return i;
            }
        }
        return -1; // Retorna -1 caso o número não seja encontrado
    }
}

