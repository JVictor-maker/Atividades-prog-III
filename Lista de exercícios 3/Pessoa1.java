class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

class Aluno extends Pessoa {
    String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
}

public class Pessoa1 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Alice", 19, "20261234");
        
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Matrícula: " + aluno.matricula);
    }
}