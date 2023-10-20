package javaCore.ZZHpadroesProjeto.test;

import javaCore.ZZHpadroesProjeto.dominio.AirCraftSingletonEager;
import javaCore.ZZHpadroesProjeto.dominio.Aircraft;

public class AicraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AicraftTest01.bookSeat("1A");

    }

    private static void bookSeat(String seat) {
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        AirCraftSingletonEager aircraft= AirCraftSingletonEager.getINSTANCE();
        System.out.println(aircraft);
    }
}
