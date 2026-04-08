import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoIngresso = 40.00;

        System.out.print("Digite o tipo de ingresso (I para inteiro, M para meia): ");
        char tipoIngresso = scanner.next().toUpperCase().charAt(0);

        if (tipoIngresso == 'M') {
            System.out.printf("Valor a ser pago: R$ %.2f\n", precoIngresso * 0.5);
        } else if (tipoIngresso == 'I') {
            System.out.printf("Valor a ser pago: R$ %.2f\n", precoIngresso);
        } else {
            System.out.println("Opção de ingresso inválida.");
        }

        scanner.close();
    }
}