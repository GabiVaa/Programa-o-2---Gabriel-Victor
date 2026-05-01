public class Produto {

    public String nome;
    public double preco;
    public int quantidadeEstoque;


    public Produto(String nome, double preco, int quantidadeInicial) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeInicial;
    }


    public void exibirInfo() {
        System.out.println("--- Informações do Produto ---");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }


    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEstoque;
    }


    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque de " + nome + ".");
        }
    }
}
