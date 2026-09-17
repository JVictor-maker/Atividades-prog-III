import java.util.ArrayList;
import java.util.Iterator;

public class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria(101, "João", 1500.50));
        contas.add(new ContaBancaria(102, "Maria", 3200.75));
        contas.add(new ContaBancaria(103, "Pedro", 800.00));

        double saldoTotal = 0;
        Iterator<ContaBancaria> iterator = contas.iterator();

        while (iterator.hasNext()) {
            ContaBancaria conta = iterator.next();
            System.out.println("Número: " + conta.numero + " | Titular: " + conta.titular);
            saldoTotal += conta.saldo;
        }

        System.out.printf("Saldo total acumulado: R$ %.2f\n", saldoTotal);
    }
}