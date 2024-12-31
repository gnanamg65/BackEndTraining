package Day2.thisAndMethodOverloading;
import  java.util.*;
public class CalculatingArea {
    public double area(double radius){
        return Math.PI*radius*radius;
    }
    public double area(double length,double breadth){
        return length*breadth;
    }
    public Float area(float base,float height){
        return 0.5f*base*height;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CalculatingArea calculatingArea=new CalculatingArea();
        double ans1= calculatingArea.area(sc.nextDouble());
        System.out.print("Area of Circle:"+(float)ans1);
        double ans2=calculatingArea.area(sc.nextDouble(),sc.nextDouble());
        System.out.println("Area of Rectangle:"+ans2);
        float ans3=calculatingArea.area(sc.nextFloat(),sc.nextFloat());
        System.out.println("Area of Triangle:"+ans3);
    }
}
