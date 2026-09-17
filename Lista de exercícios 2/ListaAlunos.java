import java.util.ArrayList;
import java.util.Iterator;

public class ListaAlunos {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        
        alunos.add("Alice");
        alunos.add("Paulo");
        alunos.add("Carlos");
        alunos.add("Arthur");
        alunos.add("Matheus");

        Iterator<String> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        alunos.remove("Carlos");

        System.out.println("Lista atualizada:");
        Iterator<String> novoIterator = alunos.iterator();
        while (novoIterator.hasNext()) {
            System.out.println(novoIterator.next());
        }
    }
}