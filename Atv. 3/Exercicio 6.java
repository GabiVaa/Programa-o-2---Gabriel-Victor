import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase completa: ");
        String frase = scanner.nextLine();
        
        System.out.print("Digite uma palavra para buscar: ");
        String palavra = scanner.nextLine();

        int posicao = frase.indexOf(palavra);

        if (posicao != -1) {
            System.out.println("A palavra aparece na frase a partir do índice: " + posicao);
        } else {
            System.out.println("A palavra não foi encontrada na frase (retornou -1).");
        }
        
        scanner.close();
    }
}
