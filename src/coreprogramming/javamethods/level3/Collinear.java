package coreprogramming.methods.level3;
public class Collinear {

    public static boolean collinearSlope(double x1,double y1,double x2,double y2,double x3,double y3){
        return (y2-y1)/(x2-x1) == (y3-y2)/(x3-x2);
    }

    public static boolean collinearArea(double x1,double y1,double x2,double y2,double x3,double y3){
        double area = 0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area == 0;
    }
}

