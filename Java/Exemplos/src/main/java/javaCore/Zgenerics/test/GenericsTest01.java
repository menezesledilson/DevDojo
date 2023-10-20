package javaCore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    public static void main(String[] args) {
        List lista = new ArrayList<>();
        lista.add("Midoriya");


        for (Object o : lista){
            System.out.println(o);
        }
        add(lista, new Consumidor01("Midoriya"));
    }

    private static  void add (List lista, Consumidor01 consumidor01){
lista.add(consumidor01);
    }
}
