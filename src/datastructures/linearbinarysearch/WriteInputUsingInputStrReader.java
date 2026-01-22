package datastructures.linearbinarysearch;

import java.io.*;

class WriteInputUsingInputStrReader {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("output.txt");
        String line;
        while (!(line = in.readLine()).equals("exit")) fw.write(line + "\n");
        fw.close();
    }
}