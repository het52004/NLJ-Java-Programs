import java.util.Scanner;
import java.io.*;

public class TestFile {
    public static void main(String[] args) {
        try {
            int sum = 0;
            String fileName = "TestFile.txt";
            File testFile = new File(fileName);
            BufferedWriter writer = new BufferedWriter(new FileWriter("sum.txt", true));
            Scanner sc = new Scanner(testFile);
            while (sc.hasNext()) {
                String values = sc.next();
                sum = sum + Integer.parseInt(values);
            }
            writer.write("Sum of numbers is = " + sum);
            writer.newLine();
            sc.close();
            writer.close();
        } catch (NumberFormatException e) {
            System.out.println("Enter only space seperated or line seperated numbers to add.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
