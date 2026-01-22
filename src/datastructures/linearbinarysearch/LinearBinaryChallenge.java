package datastructures.linearbinarysearch;

import java.util.Arrays;

class LinearBinaryChallenge {
    public static void main(String[] args) {
        int[] a = {3,4,-1,1};
        boolean[] seen = new boolean[a.length+1];
        for (int x : a) if (x>0 && x<=a.length) seen[x]=true;
        for (int i=1;i<=a.length;i++) if(!seen[i]){System.out.println(i);break;}

        Arrays.sort(a);
        int t=4,l=0,r=a.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==t){System.out.println(m);return;}
            if(a[m]<t)l=m+1;else r=m-1;
        }
        System.out.println(-1);
    }
}