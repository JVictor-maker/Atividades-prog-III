class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}

public class TesteAnimal {
    public static void main(String[] args) {
        Animal[] animais = new Animal[2];
        animais[0] = new Cachorro();
        animais[1] = new Gato();

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}