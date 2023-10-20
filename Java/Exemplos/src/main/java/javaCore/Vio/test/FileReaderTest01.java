package javaCore.Vio.test;
//file
//File Writter
//BuffereadWritter
//BufferedReafer

import java.io.*;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.text");

        try (FileReader fr = new FileReader(file)) {
//            char [] in = new char[1000];
//            int size = fr.read(in);
//             System.out.println(size);
//           for (char c : in){
//               System.out.println(c);
//           }
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
