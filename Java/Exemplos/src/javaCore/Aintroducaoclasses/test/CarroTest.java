package javaCore.Aintroducaoclasses.test;

import javaCore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro  carro1 = new Carro();
        Carro  carro2 = new Carro();

        carro1.nome = "Gol";
        carro1.modelo = "Quadrado";
        carro1.ano = 1990;

        carro2.ano = 1996;
        carro2.nome = "Uno";
        carro2.modelo = "Sport";

        System.out.println("Carro: " + carro2.nome + " ,Modelo: " + carro2.modelo + " ,Ano: " + carro2.ano );

        System.out.println("-------------------------");

        System.out.println("Carro: " + carro1.nome + " ,Modelo: " + carro1.modelo + " ,Ano: " + carro1.ano);
    }
}
