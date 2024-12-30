package Day3;
interface Constants{
    static double PI=3.14;
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
