import java.util.ArrayList;
import java.util.Iterator;

public class CadastroPessoa {

    public static boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty() && nome.trim().length() >= 3;
    }

    public static boolean buscarNome(ArrayList<String> lista, String busca) {
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String nomeNaLista = iterator.next();
            if (nomeNaLista.equalsIgnoreCase(busca)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();

        String[] nomesParaAdicionar = {"Ana", "Carlos", "Beatriz", "Daniel"};
        
        for (String n : nomesParaAdicionar) {
            if (validarNome(n)) {
                usuarios.add(n);
            }
        }

        String nomeBusca = "carlos";
        boolean encontrou = buscarNome(usuarios, nomeBusca);
        System.out.println("Usuário '" + nomeBusca + "' encontrado? " + encontrou);
    }
}