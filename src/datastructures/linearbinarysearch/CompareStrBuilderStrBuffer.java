package datastructures.linearbinarysearch;

class CompareStrBuilderStrBuffer {
    public static void main(String[] args) {
        long start, end;

        StringBuilder sb1 = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) sb1.append("hi");
        end = System.nanoTime();
        System.out.println("StrBuilder: " + (end - start));

        StringBuffer sb2 = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) sb2.append("hi");
        end = System.nanoTime();
        System.out.println("StrBuffer: " + (end - start));
    }
}