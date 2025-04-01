//Peça ao usuário para inserir um conjunto de números e determine o maior e o menor valor.
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos números deseja inserir?");
        int quantidade = scanner.nextInt();
        
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
            return;
        }
        
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        
        scanner.close();
    }
}
