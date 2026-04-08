import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Porcentagem da taxa de serviço (%): ");
        double taxa = scanner.nextDouble();

        // Produto 1
        System.out.print("Código do produto 1: ");
        int codigo1 = scanner.nextInt();
        System.out.print("Valor unitário do produto 1: R$ ");
        double valor1 = scanner.nextDouble();
        System.out.print("Quantidade comprada do produto 1: ");
        int quant1 = scanner.nextInt();

        // Produto 2
        System.out.print("Código do produto 2: ");
        int codigo2 = scanner.nextInt();
        System.out.print("Valor unitário do produto 2: R$ ");
        double valor2 = scanner.nextDouble();
        System.out.print("Quantidade comprada do produto 2: ");
        int quant2 = scanner.nextInt();

        // Cálculo final seguindo a fórmula do exercício
        double valorTotal = (valor1 * quant1 + valor2 * quant2) * (taxa / 100.0 + 1);

        System.out.printf("O valor total da compra com a taxa é: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}