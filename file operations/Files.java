import java.util.*;
import java.io.*;
import java.net.URI;

public class Files {
    public static void main(String[] args) {
        File file = new File("sum.txt");
        System.out.println(file.canWrite());
        System.out.println(file.getName());
        URI fileURI = file.toURI();
        System.out.println(fileURI);
    }
}
