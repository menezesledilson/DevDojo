package javaCore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.text");
        try {

            //    boolean isDelete = file.delete();
            boolean isCreated = file.createNewFile();

            System.out.println("Createed " + isCreated);
            System.out.println("path" + file.getPath());
            System.out.println("path absolute" + file.getAbsolutePath());
            System.out.println("is file" + file.isFile());
            System.out.println("is Hidden" + file.isHidden());
            System.out.println("last modified" + new Date(file.lastModified()));

            boolean exists = file.exists();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
