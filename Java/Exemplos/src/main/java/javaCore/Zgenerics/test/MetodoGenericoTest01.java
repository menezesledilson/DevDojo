package javaCore.Zgenerics.test;


import javaCore.Zgenerics.dominio.Barco;


import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa Marota"));
    }

    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);

    }
}
