import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("O dobro desse número é: " + (numero * 2));
        System.out.println("O triplo desse número é: " + (numero * 3));

        scanner.close();
    }
}