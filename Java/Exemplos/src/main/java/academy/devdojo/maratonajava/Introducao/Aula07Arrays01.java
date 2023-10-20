package academy.devdojo.maratonajava.Introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        // byte, short, int, long, float e double o valor é zero
        // char '\u0000' ' '
        //boolean false
        // string null

       String [] nomes = new String[4];

       nomes[0] = "goku";
       nomes[1] = "Kurosaki";
       nomes[2] = "Luffy";
       nomes[3] = "Hinata";

       for (int i =0; i < nomes.length; i++){
           System.out.println(nomes[i]);
       }
    }
}
