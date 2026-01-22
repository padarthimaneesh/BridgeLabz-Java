package datastructures.algorithmruntimeanalysis;

import java.io.*;

public class FileReadingComparison {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("sample.txt");
        while (fr.read() != -1) {}
        fr.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("sample.txt"));
        while (isr.read() != -1) {}
        isr.close();

        System.out.println("File Read Complete");
    }
}