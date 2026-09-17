public class ATD03{
    public static void main(String[] args) {
        int quantidade = 30;
        long primeiro = 1, segundo = 1;

        System.out.println("Os 30 primeiros números dessa sequência são:");
        
        for (int i = 1; i <= quantidade; i++) {
            System.out.print(primeiro + " ");
            
            long proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}