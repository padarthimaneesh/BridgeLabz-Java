package coreprogramming.methods.level3;
public class NumberChecker {

    public static int digitCount(int n){
        return String.valueOf(n).length();
    }

    public static int[] digits(int n){
        int len=digitCount(n);
        int[] d=new int[len];
        for(int i=len-1;i>=0;i--){ d[i]=n%10; n/=10; }
        return d;
    }

    public static boolean isDuck(int[] d){
        for(int i=1;i<d.length;i++) if(d[i]==0) return true;
        return false;
    }

    public static boolean isArmstrong(int n){
        int[] d=digits(n);
        int p=d.length,sum=0;
        for(int x:d) sum+=Math.pow(x,p);
        return sum==n;
    }
}
