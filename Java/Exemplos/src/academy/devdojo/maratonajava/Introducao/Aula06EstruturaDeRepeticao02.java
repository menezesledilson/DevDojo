package academy.devdojo.maratonajava.Introducao;

public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {
        // imprimir todos os números pares de 0 até 100000

        for(int i = 0; i <1000000; i++){
            if(i % 2 ==0) {
                System.out.println(i);
            }
        }
    }
}
