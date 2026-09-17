import java.util.Arrays;

class Produto implements Comparable<Produto> {
    String nome;
    double preco;
    String codigoDeBarras;

    public Produto(String nome, double preco, String codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Preço: R$ " + preco + " | Código: " + codigoDeBarras;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produto produto = (Produto) obj;
        return codigoDeBarras.equals(produto.codigoDeBarras);
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }
}

class Livro extends Produto {
    String autor;

    public Livro(String nome, double preco, String codigoDeBarras, String autor) {
        super(nome, preco, codigoDeBarras);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " | Autor: " + autor;
    }
}

class CD extends Produto {
    int numeroFaixas;

    public CD(String nome, double preco, String codigoDeBarras, int numeroFaixas) {
        super(nome, preco, codigoDeBarras);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Faixas: " + numeroFaixas;
    }
}

class DVD extends Produto {
    int duracao;

    public DVD(String nome, double preco, String codigoDeBarras, int duracao) {
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duração: " + duracao + " min";
    }
}

public class Loja2 {
    public static void main(String[] args) {
        Produto[] estoque = new Produto[5];
        
        estoque[0] = new Livro("Java Completo", 120.50, "1111", "Deitel");
        estoque[1] = new CD("The Wall", 45.90, "2222", 13);
        estoque[2] = new DVD("O Auto da Compadecida", 35.00, "3333", 104);
        estoque[3] = new Livro("Estrutura de Dados", 95.00, "4444", "Tenenbaum");
        estoque[4] = new CD("Clube da Esquina", 50.00, "5555", 21);

        Arrays.sort(estoque);

        System.out.println("Vetor ordenado por preço:");
        for (Produto p : estoque) {
            System.out.println(p);
        }
    }
}