package javaCore.ZZHpadroesProjeto.test;

import javaCore.ZZHpadroesProjeto.dominio.AirCraftSingletonEager;
import javaCore.ZZHpadroesProjeto.dominio.Country;
import javaCore.ZZHpadroesProjeto.dominio.Currency;
import javaCore.ZZHpadroesProjeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }

    private static void bookSeat(String seat){
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        AirCraftSingletonEager aircraft= AirCraftSingletonEager.getINSTANCE();
        System.out.println(aircraft);

    }
}
