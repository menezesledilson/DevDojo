package javaCore.Oexeception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(1, 0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    private static int divisao(int a, int b) {

        if (b == 0) {
            throw new RuntimeException("Argumento ilegal, não poder ser 0");
        }
        return a / b;

    }
}
