package Day3.Abstract;

abstract class Ashape {
    abstract void calculateArea();
}
class Circle extends Ashape{
    int radius;
    Circle(){
        this.radius=5;
    }
    @Override
    void calculateArea() {
        System.out.println("Area of Circle:"+(3.14*radius*radius));
    }
}
class rectangle extends Ashape{
    int length;
    int breadth;
    rectangle(){
        this.length=5;
        this.breadth=10;
    }
    @Override
    void calculateArea() {
        System.out.println("Area of Rectangle:"+(length*breadth));
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        rectangle rectangle=new rectangle();
        circle.calculateArea();
        rectangle.calculateArea();
    }
}
