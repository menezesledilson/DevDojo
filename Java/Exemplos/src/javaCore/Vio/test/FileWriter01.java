package javaCore.Vio.test;
//file
//File Writter
//BuffereadWritter
//BufferedReafer

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.text");
        try ( FileWriter fw = new FileWriter(file, true)){
           fw.write("O DevDojo é lindo, é mlhor curso do brasilllll\nContinuando na proxima linha");
           fw.flush();
        } catch (IOException ex) {
             ex.printStackTrace();
        }
    }
}
