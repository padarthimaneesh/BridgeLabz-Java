package javacollectionsandstreams.javaiostreams;

import java.io.*;

public class StudentBinary {
    public static void main(String[] args) throws Exception {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("stud.bin"))) {
            dos.writeInt(1);
            dos.writeUTF("Karthik");
            dos.writeDouble(8.9);
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("stud.bin"))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
        }
    }
}