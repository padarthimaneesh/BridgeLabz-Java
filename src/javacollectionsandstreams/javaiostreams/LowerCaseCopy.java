package javacollectionsandstreams.javaiostreams;

import java.io.*;

public class LowerCaseCopy {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("in.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))) {
            int c;
            while ((c = br.read()) != -1)
                bw.write(Character.toLowerCase(c));
        }
    }
}