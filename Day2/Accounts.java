package Day2;
import java.util.*;
public class Accounts {
    private final int accountNumber;
    private final double balance;

    public Accounts() {
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    public Accounts(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public Accounts(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Accounts account1 = new Accounts();
        account1.displayDetails();
        Accounts accounts2=new Accounts(sc.nextInt());
        accounts2.displayDetails();
        Accounts accounts3=new Accounts(sc.nextInt(), sc.nextDouble());
        accounts3.displayDetails();

    }
}
