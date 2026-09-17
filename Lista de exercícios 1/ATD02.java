public class  ATD02{
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("A variável 'a' é: " + a);
        System.out.println("A variável 'b' é: " + b);
        System.out.println("A variável 'c' é: " + c);

        if (a && c) {
            System.out.println("As variáveis 'a' e 'c' são verdadeiras!");
        }
        if (!b) {
            System.out.println("A variável 'b' é falsa.");
        }
    }
}