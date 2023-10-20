package javaCore.ZZHpadroesProjeto.test;

import javaCore.ZZHpadroesProjeto.dominio.AirCraftSingletonEager;
import javaCore.ZZHpadroesProjeto.dominio.Aircraft;

public class AicraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
     static void bookSeat(String seat) {
         System.out.println(AirCraftSingletonEager.getINSTANCE());
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
