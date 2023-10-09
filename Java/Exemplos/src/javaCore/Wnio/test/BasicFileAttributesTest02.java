package javaCore.Wnio.test;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/new.txt");

        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("CreationTime " + creationTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);
        System.out.println("lastAccessTime " + lastAccessTime);

        BasicFileAttributeView fileAttributesView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributesView.setTimes(lastModifiedTime, newCreationTime, lastAccessTime);

        basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        creationTime = basicFileAttributes.creationTime();
        lastModifiedTime = basicFileAttributes.lastModifiedTime();
        lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("Updated CreationTime " + creationTime);
        System.out.println("Updated lastModifiedTime " + lastModifiedTime);
        System.out.println("Updated lastAccessTime " + lastAccessTime);
    }
}
