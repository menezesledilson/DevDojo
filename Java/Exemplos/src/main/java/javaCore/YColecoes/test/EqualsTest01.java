package javaCore.YColecoes.test;

import javaCore.YColecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC","iphone");
        Smartphone s2 = new Smartphone("1ABC","iphone");
        System.out.println(s1.equals(s2));

    }
}
