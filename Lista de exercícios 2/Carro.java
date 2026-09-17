public class Carro {
    String marca;
    String modelo;
    int ano;

    public void exibirInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2010;

        Carro carro2 = new Carro();
        carro2.marca = "Volkswagen";
        carro2.modelo = "Gol";
        carro2.ano = 2015;

        carro1.exibirInfo();
        carro2.exibirInfo();
    }
}