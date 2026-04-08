import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("A palavra possui " + palavra.length() + " caracteres.");
        
        scanner.close();
    }
}
