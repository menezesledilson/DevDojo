package academy.devdojo.maratonajava.Introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {

        //int, double, float, char, byte, short, long, boolean

        int idade = (int)10000000000L;
        long numeroGrande = 10000L;
        double salarioDouble = 2000.0D;
        float salarioFloar = (float) 2500.0D;
        byte idadeByte = -127;
        short idaddeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku ";


        System.out.println("A idade é " + idade + " anos");
        System.out.println("A idade é " + falso);
        System.out.println("char " + caractere);
        System.out.println("char " + idade);
        System.out.println("char " + salarioFloar);
        System.out.println("Oi! eu sou " + nome);


    }
}
