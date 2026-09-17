public class Livro {
    String titulo;
    String autor;

    public Livro() {
        this.titulo = "Sem Título";
        this.autor = "Sem Autor";
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");

        System.out.println("Livro 1: " + livro1.titulo + " - " + livro1.autor);
        System.out.println("Livro 2: " + livro2.titulo + " - " + livro2.autor);
    }
}