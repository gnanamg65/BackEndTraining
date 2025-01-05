package Day7.Synchronised;
class SharedPrinter {
    //OLL
    public synchronized void printString(String str) {
        for (int i = 0; i < 5; i++) {
            System.out.println(str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void countdown(int num) {
        for (int i = num; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //CLL
    public static synchronized void staticPrintString(String str) {
        for (int i = 0; i < 5; i++) {
            System.out.println(str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static synchronized void staticCountdown(int num) {
        for (int i = num; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter();

        // Object-level locking with the same instance
        Thread thread1 = new Thread(() -> sharedPrinter.printString("Hello"));
        Thread thread2 = new Thread(() -> sharedPrinter.countdown(5));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread3 = new Thread(() -> SharedPrinter.staticPrintString("World"));
        Thread thread4 = new Thread(() -> SharedPrinter.staticCountdown(5));

        thread3.start();
        thread4.start();
    }
}