package by.mainTask;
import java.io.*;
import java.util.Arrays;

public class MainTask {
    public static void main(String[] args) throws IOException {
        for (String element: args){
            System.out.println(" element = " + element);
        }
        FileInputStream input = null;
        try {
            input = new FileInputStream("movies/File.txt");
            int code = input.read();
            System.out.println(code + " char = " + (char) code);
            byte[] ar = new byte[1000];
            int num = input.read(ar);
            System.out.println("num =" + num);
            System.out.println(Arrays.toString(ar));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null){
                    input.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
