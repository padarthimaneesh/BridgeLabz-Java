package datastructures.linearbinarysearch;
import java.io.*;

class ReadFileUsingInputStrReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("data.txt"), "UTF-8"));
        String line;
        while ((line = br.readLine()) != null) System.out.println(line);
        br.close();
    }
}