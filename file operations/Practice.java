import java.io.*;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        File f = new File("Practice.txt");
        try {
            if(!f.exists()){
                f.createNewFile();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(f));
            writer.write("Java is tricky!");
            writer.close();
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                System.out.print(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
