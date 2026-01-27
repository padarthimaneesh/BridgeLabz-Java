package coreprogramming.methods.level3;
import java.util.Random;

public class FootballHeights {

    static int[] heights = new int[11];

    public static int sum(){
        int s=0;
        for(int h:heights) s+=h;
        return s;
    }

    public static int min(){
        int m=heights[0];
        for(int h:heights) m=Math.min(m,h);
        return m;
    }

    public static int max(){
        int m=heights[0];
        for(int h:heights) m=Math.max(m,h);
        return m;
    }

    public static void main(String[] args){
        Random r=new Random();
        for(int i=0;i<11;i++) heights[i]=150+r.nextInt(101);

        System.out.println("Mean="+sum()/11.0);
        System.out.println("Shortest="+min());
        System.out.println("Tallest="+max());
    }
}
