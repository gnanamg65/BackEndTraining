package Day3;
import java.util.*;
public class Shape {
    void area(){
        System.out.println("Area of shape:");
    }
}
class Rectangle extends Shape{
    public int length;
    public int breadth;
    Rectangle(){
        this.length=5;
        this.breadth=10;
    }
    void area(){
        super.area();
        System.out.println("Area of rectangle:"+(length*breadth));
    }
}
class Square extends Rectangle{
    int side;
    Square(int n){
        this.side=n;
    }
    void area(){
        super.area();
        System.out.println("Area of circle:"+side*side);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Square circle=new Square(sc.nextInt());
         circle.area();
    }
}
