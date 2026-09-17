import java.util.Scanner;

public class ATD04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolhe a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': 
                if (num2 != 0) {
                    resultado = num1 / num2; 
                } else {
                    System.out.println("Não dá conta de dividir por zero não!");
                    operacaoValida = false;
                }
                break;
            default: 
                System.out.println("Operação inválida, digitou o trem errado.");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("O resultado deu: " + resultado);
        }
        
        scanner.close();
    }
}