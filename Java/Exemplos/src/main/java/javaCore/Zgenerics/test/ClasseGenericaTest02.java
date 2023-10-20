package javaCore.Zgenerics.test;

import javaCore.Zgenerics.dominio.Barco;
import javaCore.Zgenerics.dominio.Carro;
import javaCore.Zgenerics.service.BarcoRentavelService;
import javaCore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {

      BarcoRentavelService barcoRentavelService = new BarcoRentavelService();

        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês....");

        barcoRentavelService.retornarBarcoAlugado(barco);


    }
}
