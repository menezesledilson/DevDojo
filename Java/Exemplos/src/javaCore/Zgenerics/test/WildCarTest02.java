package javaCore.Zgenerics.test;


abstract class Animal {
    public abstract void consulta();


}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Dog");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Gato ");
    }
}

public class WildCarTest01 {

    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        printConsulta(cachorros);
        printConsulta(gatos);

        Animal animal = new Gato();
        printConsulta(animal);
    }

    private static void printConsulta(Animal[] animals) {

        for (Animal animal : animals) {
            animal.consulta();
        }


    }
}
