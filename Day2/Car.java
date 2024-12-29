package Day2;
import java.util.*;
public class Car {
    String brand;
    String model;
    double price;
    public void display(){
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
    }
    public double calculateDiscount( double discount) {
        if(discount>0&&discount<100) {
            return price - (price * discount / 100);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        car.price=sc.nextDouble();
        car.model=sc.nextLine();
        car.brand=sc.nextLine();
        car.display();
        double discount=sc.nextDouble();
        double discountprice=  car.calculateDiscount(discount);
        System.out.println(discountprice);
    }

}

