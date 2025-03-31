import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        rwFile();
    }

    public static void fileClassMethods() {
        try {
            File file = new File("test.txt");
            if (!file.exists()) {
                file.createNewFile();
            } else {
                System.out.println(file.getName());
                System.out.println(file.length());
                System.out.println(file.getParent());
                System.out.println(file.getPath());
                System.out.println(file.canWrite());
                String[] files = file.list();
                System.out.println(files.length);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void rwFile(){
        try {
            File reader = new File("test.txt");
            Scanner sc = new Scanner(reader);
            System.out.println(sc.next());
        } catch (Exception e) {
            
        }
    }
}
