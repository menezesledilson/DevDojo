package academy.devdojo.maratonajava.Introducao;

public class Aula06EstruturaDeRepeticao03 {
    //Imprima os primeiro 25 numeros de um dado valor.Por exemplo, 50
    public static void main(String[] args) {

        int valorMax = 50;
        for (int i = 0; i < valorMax; i++) {

            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
