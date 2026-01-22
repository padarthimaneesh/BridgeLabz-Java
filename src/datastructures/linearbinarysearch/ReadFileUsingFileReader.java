package datastructures.linearbinarysearch;

import java.io.*;

class ReadFileUsingFileReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;
        while ((line = br.readLine()) != null) System.out.println(line);
        br.close();
    }
}