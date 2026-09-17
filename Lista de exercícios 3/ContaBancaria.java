public class ContaBancaria {
    int numero;

    public ContaBancaria(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta Bancária Número: " + numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ContaBancaria that = (ContaBancaria) obj;
        return numero == that.numero;
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(12345);
        ContaBancaria conta2 = new ContaBancaria(12345);

        System.out.println(conta1.equals(conta2));
        System.out.println(conta1.toString());
    }
}
