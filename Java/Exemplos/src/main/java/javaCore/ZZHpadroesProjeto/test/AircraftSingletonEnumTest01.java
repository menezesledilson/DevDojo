package javaCore.ZZHpadroesProjeto.test;

import javaCore.ZZHpadroesProjeto.dominio.AicraftSingletonEnum;
import javaCore.ZZHpadroesProjeto.dominio.AirCraftSingletonLazy;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }
    private static void bookSeat(String seat){
        System.out.println(AicraftSingletonEnum.INSTANCE.hashCode());
        AicraftSingletonEnum instance = AicraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
