package academy.devdojo.maratonajava.Introducao;

public class Aula05EstruturasCondicionais03 {

    public static void main(String[] args) {

        //ternário

        /*
         * string resultado = (condicao)? verdadeiro : falso;*/
        double salario = 6000;
        String resultado = salario > 5000 ? "eu vou doar 500 pro Devdojo" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);
    }
}
