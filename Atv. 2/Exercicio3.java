import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor unitário do produto: R$ ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = valorUnitario * quantidade;

        if (valorTotal > 100.0) {
            valorTotal = valorTotal - (valorTotal * 0.08); // Aplica 8% de desconto
        }

        System.out.printf("O valor final da compra é: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}