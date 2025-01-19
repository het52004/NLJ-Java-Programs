import java.util.*;
import java.io.*;

public class Files {
    public static void main(String[] args) {
        File file = new File("sum.txt");
        System.out.println(file.canWrite());
        System.out.println(file.getName());
    }
}
