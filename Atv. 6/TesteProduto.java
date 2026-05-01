public class TesteProduto {
    public static void main(String[] args) {
        // Instanciando dois produtos diferentes
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Mouse Gamer", 150.00, 50);

        // Chamando exibirInfo para ambos
        p1.exibirInfo();
        p2.exibirInfo();

        System.out.println("\n--- Operações ---");

        // Calcular e imprimir o valor total em estoque do primeiro produto
        double valorTotalP1 = p1.calcularValorTotalEmEstoque();
        System.out.println("Valor total de " + p1.nome + " em estoque: R$ " + valorTotalP1);

        // Adicionar itens ao estoque do segundo produto
        p2.adicionarEstoque(20);

        // Exibir informações novamente para ver a atualização
        System.out.println("\n--- Após atualização de estoque ---");
        p2.exibirInfo();
        
        // Verificando o novo valor total do segundo produto
        System.out.println("Novo valor total de " + p2.nome + ": R$ " + p2.calcularValorTotalEmEstoque());
    }
}
