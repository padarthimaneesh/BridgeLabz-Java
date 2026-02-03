package javacollectionsandstreams.javaexceptions;

import java.io.*;

public class ResourceReadExceptionHandler {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}