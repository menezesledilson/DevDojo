package javaCore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.text");
        try ( FileWriter fw = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fw)){
            br.write("O DevDojo é lindo, é mlhor curso do brasilllll");
            br.newLine();
            br.flush();
            System.out.println();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
