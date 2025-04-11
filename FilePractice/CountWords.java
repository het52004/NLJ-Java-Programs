import java.io.*;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) throws IOException{
        File file = new File("P.txt");
        Scanner sc = new Scanner(file);
        int WordCount = 0, CharacterCount = 0, LineCount = 0;
        while(sc.hasNext()){
            WordCount ++;
            CharacterCount += sc.next().length();
        }
        sc.close();
        Scanner sc1 = new Scanner(file);
        while(sc1.hasNextLine()){
            LineCount++;
            sc1.nextLine();
        }
        sc1.close();
        System.out.println("Wordcount = " + WordCount + "\nLinecount = " + LineCount + "\nCharactercount = " + CharacterCount);
    }
}