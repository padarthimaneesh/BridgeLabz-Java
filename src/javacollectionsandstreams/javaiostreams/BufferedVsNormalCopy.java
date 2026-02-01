package javacollectionsandstreams.javaiostreams;

import java.io.*;

public class BufferedVsNormalCopy {
    public static void main(String[] args) throws Exception {
        File src = new File("bigfile.dat");
        File dest1 = new File("copy1.dat");
        File dest2 = new File("copy2.dat");

        long start = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest1)) {
            byte[] buf = new byte[4096];
            int n;
            while ((n = fis.read(buf)) != -1) fos.write(buf, 0, n);
        }
        long normalTime = System.nanoTime() - start;

        start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest2))) {
            byte[] buf = new byte[4096];
            int n;
            while ((n = bis.read(buf)) != -1) bos.write(buf, 0, n);
        }
        long bufferedTime = System.nanoTime() - start;

        System.out.println("Normal ns: " + normalTime);
        System.out.println("Buffered ns: " + bufferedTime);
    }
}