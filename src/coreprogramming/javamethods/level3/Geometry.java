package coreprogramming.methods.level3;
public class Geometry {

    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public static double[] lineEquation(double x1,double y1,double x2,double y2){
        double m = (y2-y1)/(x2-x1);
        double b = y1 - m*x1;
        return new double[]{m,b};
    }

    public static void main(String[] args){
        double[] eq = lineEquation(1,2,4,6);
        System.out.println("Slope="+eq[0]+" Intercept="+eq[1]);
    }
}
