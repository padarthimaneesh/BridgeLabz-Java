package coreprogramming.methods.level3;
public class SpecialNumbers {

    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++) if(n%i==0) return false;
        return true;
    }

    public static boolean isNeon(int n){
        int sq=n*n,sum=0;
        while(sq>0){ sum+=sq%10; sq/=10; }
        return sum==n;
    }

    public static boolean isSpy(int n){
        int s=0,p=1;
        while(n>0){ int d=n%10; s+=d; p*=d; n/=10; }
        return s==p;
    }

    public static boolean isAutomorphic(int n){
        return String.valueOf(n*n).endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n){
        return n%7==0 || n%10==7;
    }
}
