package javacollectionsandstreams.javaiostreams;

import java.io.*;
import java.util.Arrays;

public class ImageByteCopy {
    public static void main(String[] args) throws Exception {
        byte[] data;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream("img.jpg")) {
            fis.transferTo(baos);
            data = baos.toByteArray();
        }

        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             FileOutputStream fos = new FileOutputStream("img_copy.jpg")) {
            bais.transferTo(fos);
        }

        System.out.println("Done");
    }
}