package academy.devdojo.maratonajava.Introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - /*

        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;

        System.out.println(resultado);

        //%

        int resto = 20 % 2;
        System.out.println(resto);

        //< > <= >=  == comparação  !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezigualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte " + isDezIgualVinte);
        System.out.println("isDezMaiorQueVinte " + isDezigualDez);
        System.out.println("isDezMaiorQueVinte " + isDezDiferenteDez);

        // && (and) || (or) ! not

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta" + isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta" + isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);


        // = +=, -=, *=, /=, %= operadores de atribuição
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;

        bonus *=2;
        System.out.println(bonus);

        //
        int contador  = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;

        int contador2 = 0 ;
        System.out.println(contador);
        System.out.println(contador2++);
        System.out.println(contador2);

    }
}
