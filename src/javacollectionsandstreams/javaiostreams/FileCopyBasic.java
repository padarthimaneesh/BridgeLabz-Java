package javacollectionsandstreams.javaiostreams;

import java.io.*;

public class FileCopyBasic {
    public static void main(String[] args) {
        File source = new File("source.txt");
        File dest = new File("dest.txt");

        if (!source.exists()) {
            System.out.println("Source file not found.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}