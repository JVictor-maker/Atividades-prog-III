class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Preço: R$ " + preco;
    }
}

class Livro extends Produto {
    String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " | Autor: " + autor;
    }
}

class CD extends Produto {
    int numeroFaixas;

    public CD(String nome, double preco, int numeroFaixas) {
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Faixas: " + numeroFaixas;
    }
}

class DVD extends Produto {
    int duracao;

    public DVD(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duração: " + duracao + " min";
    }
}

public class Loja {
    public static void main(String[] args) {
        Produto[] estoque = new Produto[5];
        
        estoque[0] = new Livro("Java Completo", 120.50, "Deitel");
        estoque[1] = new CD("The Wall", 45.90, 13);
        estoque[2] = new DVD("O Auto da Compadecida", 35.00, 104);
        estoque[3] = new Livro("Estrutura de Dados", 95.00, "Tenenbaum");
        estoque[4] = new CD("Clube da Esquina", 50.00, 21);

        for (Produto p : estoque) {
            System.out.println(p);
        }
    }
}