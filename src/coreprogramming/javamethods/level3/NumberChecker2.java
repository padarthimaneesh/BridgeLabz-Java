package coreprogramming.methods.level3;
public class NumberChecker2 {

    public static int sumDigits(int[] d){
        int s=0; for(int x:d)s+=x; return s;
    }

    public static boolean isHarshad(int n){
        return n%sumDigits(NumberChecker.digits(n))==0;
    }

    public static int[][] frequency(int[] d){
        int[][] f=new int[10][2];
        for(int i=0;i<10;i++) f[i][0]=i;
        for(int x:d) f[x][1]++;
        return f;
    }
}
