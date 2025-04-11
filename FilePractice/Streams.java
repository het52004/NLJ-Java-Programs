import java.io.*;

public class Streams {
    public static void main(String[] args) {
        try {
            // ByteStreams.fileInputStream();
            ByteStreams.fileOutputStream();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

class ByteStreams{
    public static void fileInputStream() throws IOException{
        FileInputStream fis = new FileInputStream("input.txt");
        int a;
        while((a = fis.read()) != -1){
            System.out.println(a);
        }
        fis.close();
    }
    public static void fileOutputStream() throws IOException{
        FileOutputStream fos = new FileOutputStream("output.txt");
        String content = "Het";
        fos.write(content.getBytes());
        fos.close();
    }
}

class CharacterStreams{

}