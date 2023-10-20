package javaCore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest01 {
    public static void main(String[] args) throws IOException {
       Path path = Paths.get("pasta/teste.txt");
       if(Files.notExists(path)) Files.createFile(path);
       DosFileAttributes dosFileAttribute = Files.readAttributes(path,DosFileAttributes.class);

        System.out.println(dosFileAttribute.isHidden());
        System.out.println(dosFileAttribute.isReadOnly());

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);

        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);

        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());

    }
}
