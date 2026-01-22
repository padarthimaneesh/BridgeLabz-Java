package datastructures.algorithmruntimeanalysis;

public class StringConcatenationTest {

    public static void main(String[] args) {

        int n = 10000;

        String s = "";
        for (int i = 0; i < n; i++) {
            s += "a";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("a");
        }

        System.out.println("Done");
    }
}