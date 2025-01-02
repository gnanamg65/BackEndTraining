package Day5.JavaPackages;
import Day5.JavaPackages.Shape.Circle;
import Day5.JavaPackages.Shape.Rectangle;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle.CalculateArea(sc.nextInt());
        Rectangle.CalculateArea(sc.nextInt(),sc.nextInt());
    }
}
