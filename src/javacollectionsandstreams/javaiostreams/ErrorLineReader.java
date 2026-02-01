package javacollectionsandstreams.javaiostreams;

import java.io.*;

public class ErrorLineReader {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("large.txt"))) {
            String line;
            while ((line = br.readLine()) != null)
                if (line.toLowerCase().contains("error"))
                    System.out.println(line);
        }
    }
}