package by.additionalTasks;
import java.io.*;

public class PublicToPrivate {
        public static final String Public = "public";
        public static final String Private = "private";

        public void publicToPrivate() throws IOException {
            File file = new File("D:\\File.java");
            File whithChangesFile = new File("D:\\NewFile.java");


            if (file.exists()) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(whithChangesFile))) {
                    String line;
                    while ((line=bufferedReader.readLine())!=null) {
                        bufferedWriter.append(line.replace(Public, Private)).append(System.lineSeparator());
                    }
                }
            }
        }
}