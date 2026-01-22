package datastructures.linearbinarysearch;

class SentenceLinearSearch {
    public static void main(String[] args) {
        String[] s = {"Java is fast", "Python is easy"};
        String key = "Python";
        for (String x : s) {
            if (x.contains(key)) { System.out.println(x); return; }
        }
        System.out.println("Not Found");
    }
}