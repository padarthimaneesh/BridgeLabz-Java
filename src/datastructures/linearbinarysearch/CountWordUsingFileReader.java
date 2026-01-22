package datastructures.linearbinarysearch;

import java.io.*;

class CountWordUsingFileReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String key = "java";
        int count = 0, i;
        String line;

        while ((line = br.readLine()) != null) {
            for (String w : line.split(" "))
                if (w.equals(key)) count++;
        }
        br.close();
        System.out.println(count);
    }
}