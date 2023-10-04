package javaCore.Oexeception.test;

import javaCore.Oexeception.Dominio.Leitor1;
import javaCore.Oexeception.Dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }

    public  static void lerAqruivo() throws IOException {
        try (Leitor1 leitor1 = new Leitor1()){
            Leitor2 leitor2 = new Leitor2() ;

        } catch (IOException e) {

        }
    }
    public static  void lerArquivo2() throws IOException {
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e){

            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
