package javacollectionsandstreams.javaiostreams;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("user.txt")) {

            System.out.print("Name: ");
            String name = br.readLine();
            System.out.print("Age: ");
            String age = br.readLine();
            System.out.print("Language: ");
            String lang = br.readLine();

            fw.write(name + "," + age + "," + lang);
            System.out.println("Saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}