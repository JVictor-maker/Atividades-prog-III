public class Produto {
    int id;
    String nome;
    double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public void aplicarDesconto(double porcentagem) {
        this.preco -= this.preco * (porcentagem / 100);
    }

    public void exibirDetalhes() {
        System.out.printf("ID: %d | Nome: %s | Preço: R$ %.2f\n", id, nome, preco);
    }

    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Notebook", 3000.00);
        Produto p2 = new Produto(2, "Mouse", 100.00);

        p1.aplicarDesconto(10);
        p2.aplicarDesconto(15);

        p1.exibirDetalhes();
        p2.exibirDetalhes();
    }
}