package by.additionalTasks;
import java.io.*;

public class JavaProgramm {

      public static void main(String args[]) throws IOException {
            FileReader fr = new FileReader("Programm.java");
            BufferedReader br = new BufferedReader(fr);
            String s;
            FileWriter fw = new FileWriter("ProgrammWhithrRverse.java");
            BufferedWriter bw = new BufferedWriter(fw);
            while((s = br.readLine()) != null) {
                for( int i=s.length()-1;i>=0;i--)
                    bw.write(s.charAt(i));
                bw.write("\r\n");
            }
            fr.close();
            bw.close();
        }
    }

