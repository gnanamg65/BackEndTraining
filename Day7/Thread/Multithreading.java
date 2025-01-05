
//Write a Java program to demonstrate the use of multithreading. The program should:
//Create two threads:
//Thread 1: Print numbers from 1 to 10 with a 500ms delay between each number.
//Thread 2: Print the square of numbers from 1 to 10 with a 700ms delay between each number.
//Ensure both threads run concurrently.
//Use Thread class or Runnable interface for thread implementation.
package Day7.Thread;

class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println("Thread one value: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}

class SquarePrinter implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println("Thread Two value: " + (i*i));
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
             e.getStackTrace();
            }
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberPrinter());
        Thread thread2 = new Thread(new SquarePrinter());
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println("Both threads have finished execution.");
    }
}
