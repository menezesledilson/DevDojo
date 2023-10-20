package javaCore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;

public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/william/dev/files.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);

        System.out.println(posixFileAttributes.permissions());
    }
}
