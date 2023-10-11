package javaCore.Zgenerics.test;

import javaCore.Zgenerics.dominio.Barco;
import javaCore.Zgenerics.dominio.Carro;
import javaCore.Zgenerics.service.BarcoRentavelService;
import javaCore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService <Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês....");

        rentalService.retornarObjetoAlugado(carro);

        System.out.println("---------------------");

        RentalService <Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês....");
        rentalServiceBarco.retornarObjetoAlugado(barco);




    }
}
