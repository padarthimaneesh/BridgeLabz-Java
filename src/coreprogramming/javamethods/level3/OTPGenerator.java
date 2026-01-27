package coreprogramming.methods.level3;
import java.util.Random;

public class OTPGenerator {

    public static int generateOTP(){
        return 100000 + new Random().nextInt(900000);
    }

    public static boolean unique(int[] otps){
        for(int i=0;i<otps.length;i++)
            for(int j=i+1;j<otps.length;j++)
                if(otps[i]==otps[j]) return false;
        return true;
    }

    public static void main(String[] args){
        int[] otp=new int[10];
        for(int i=0;i<10;i++) otp[i]=generateOTP();
        System.out.println("All unique: "+unique(otp));
    }
}
