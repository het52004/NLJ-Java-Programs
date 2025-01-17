import java.util.Scanner;
import java.io.*;

public class TestFile {
    public static void main(String[] args) {
        String fileName = "Testfile.txt";
        Scanner sc = new Scanner(fileName);
        System.out.println(sc.hasNext());
    }
}
