package javaCore.Zgenerics.test;

import javaCore.Zgenerics.dominio.Carro;
import javaCore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();

        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês....");

        carroRentavelService.retornarCarroAlugado(carro);


    }
}
