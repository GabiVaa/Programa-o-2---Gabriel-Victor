import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de 1 litro de combustível: R$ ");
        double precoLitro = scanner.nextDouble();

        System.out.print("Digite o valor que você possui para abastecer: R$ ");
        double valorDisponivel = scanner.nextDouble();

        double litros = valorDisponivel / precoLitro;

        System.out.printf("Você conseguirá comprar %.2f litros.\n", litros);

        scanner.close();
    }
}