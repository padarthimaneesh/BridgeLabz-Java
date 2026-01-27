package coreprogramming.methods.level3;
public class FactorUtils {

    public static int[] factors(int n){
        int c=0;
        for(int i=1;i<=n;i++) if(n%i==0)c++;
        int[] f=new int[c];
        int k=0;
        for(int i=1;i<=n;i++) if(n%i==0)f[k++]=i;
        return f;
    }

    public static boolean isPerfect(int n){
        int s=0;
        for(int i=1;i<n;i++) if(n%i==0)s+=i;
        return s==n;
    }

    public static boolean isAbundant(int n){
        int s=0;
        for(int i=1;i<n;i++) if(n%i==0)s+=i;
        return s>n;
    }

    public static boolean isDeficient(int n){
        int s=0;
        for(int i=1;i<n;i++) if(n%i==0)s+=i;
        return s<n;
    }
}
