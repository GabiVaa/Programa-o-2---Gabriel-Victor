import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int num1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite o segundo número inteiro: ");
                int num2 = Integer.parseInt(scanner.nextLine());

                double resultado = (double) num1 / num2;

                System.out.println("Resultado da divisão: " + resultado);
                break; // sai do loop se tudo der certo

            } catch (NumberFormatException e) {
                System.out.println("Erro: você deve digitar apenas números inteiros.");

            } catch (ArithmeticException e) {
                System.out.println("Erro: não é possível dividir por zero.");

            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado.");
            }

            System.out.println("Tente novamente.\n");
        }

        scanner.close();
    }
}
