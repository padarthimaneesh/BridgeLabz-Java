package javacollectionsandstreams.javaiostreams;

import java.io.*;

public class PipedComm {
    public static void main(String[] args) throws Exception {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        new Thread(() -> {
            try {
                pos.write("Hello".getBytes());
                pos.close();
            } catch (IOException e) {}
        }).start();

        new Thread(() -> {
            try {
                int b;
                while ((b = pis.read()) != -1)
                    System.out.print((char)b);
            } catch (IOException e) {}
        }).start();
    }
}