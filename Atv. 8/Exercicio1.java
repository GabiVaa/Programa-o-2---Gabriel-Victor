import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Bem-vindo ao Gerenciador de Lista de Compras!");

        while (opcao != 4) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar item");
            System.out.println("2. Listar itens");
            System.out.println("3. Remover item");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item a ser adicionado: ");
                    String novoItem = scanner.nextLine();
                    lista.add(novoItem);
                    System.out.println("'" + novoItem + "' foi adicionado à lista.");
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("A lista de compras está vazia.");
                    } else {
                        System.out.println("\nSua Lista de Compras:");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + ". " + lista.get(i));
                        }
                    }
                    break;

                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia, não há o que remover.");
                    } else {
                        System.out.print("Digite o índice (número) do item a ser removido: ");
                        if (scanner.hasNextInt()) {
                            int indice = scanner.nextInt();
                            
                            if (indice >= 0 && indice < lista.size()) {
                                String itemRemovido = lista.remove(indice);
                                System.out.println("Item '" + itemRemovido + "' removido com sucesso.");
                            } else {
                                System.out.println("Índice inválido! Não existe item nessa posição.");
                            }
                        } else {
                            System.out.println("Entrada inválida! Você deve digitar o número do índice.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa. Boas compras!");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 4.");
            }
        }

        scanner.close();
    }
}
