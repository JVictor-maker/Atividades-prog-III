import java.util.Scanner;

public class ATD05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o começo do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Informe o fim do intervalo: ");
        int fim = scanner.nextInt();

        System.out.println("Os números primos nesse meio são:");
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}