class Produto {
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

public class Loja1 {
    
    public static void buscarProduto(Produto[] vetor, Produto alvo) {
        boolean achou = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(alvo)) {
                System.out.println("Produto encontrado na posição do vetor: " + i);
                achou = true;
                break;
            }
        }
        if (!achou) {
            System.out.println("Produto não encontrado no vetor.");
        }
    }

    public static void main(String[] args) {
        Produto[] estoque = new Produto[5];
        
        estoque[0] = new Livro("Java Completo", 120.50, "1111", "Deitel");
        estoque[1] = new CD("The Wall", 45.90, "2222", 13);
        estoque[2] = new DVD("O Auto da Compadecida", 35.00, "3333", 104);
        estoque[3] = new Livro("Estrutura de Dados", 95.00, "4444", "Tenenbaum");
        estoque[4] = new CD("Clube da Esquina", 50.00, "5555", 21);

        for (Produto p : estoque) {
            System.out.println(p);
        }

        Produto buscaIgual = new Livro("Cópia do Java", 10.00, "1111", "Outro Autor");
        Produto buscaDiferente = new Livro("Livro Aleatório", 80.00, "9999", "João");

        System.out.println("\n--- Busca com código igual ---");
        buscarProduto(estoque, buscaIgual);
        
        System.out.println("\n--- Busca com código diferente ---");
        buscarProduto(estoque, buscaDiferente);
    }
}