//Interface with Fields:
//Define an interface Constants with static fields like PI = 3.14. Create a class Circle that uses this constant to calculate the area of a circle.
package Day3.Interface;

interface Constants {
    static double PI = 3.14;
}

class circle implements Constants{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    public  void area(){
        System.out.println("Area of Circle:"+(PI*radius*radius));
    }
}
public class InterfaceInField {
    public static void main(String[] args) {
        circle c=new circle(5);
        c.area();
    }
}
