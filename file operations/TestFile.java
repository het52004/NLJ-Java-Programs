import java.util.Scanner;
import java.io.*;

public class TestFile {
    public static void main(String[] args) {
        try {
            int sum = 0;
            String fileName = "TestFile.txt";
            File testFile = new File(fileName);
            FileWriter writer  = new FileWriter("sum.txt");
            Scanner sc = new Scanner(testFile);
            while (sc.hasNext()) {
                sum = sum + Integer.parseInt(sc.next());
            }
            writer.write("Sum of numbers is = " + sum);
            sc.close();
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
