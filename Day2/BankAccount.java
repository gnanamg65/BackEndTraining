package Day2;
import java.util.*;
class Account {
    private String AccountNumber;
    private double Balance;

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void deposit(double amount) {
        Balance += amount;
        System.out.println("Amount deposited Successfully");
    }

    public void withdraw(double amount) {
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance -= amount;
            System.out.println("Amount Withdrawn Successfully");

        }
    }

    public void checkbalance() {
        System.out.println("Balance:" + Balance);
    }
}
public class BankAccount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account account=new Account();
        System.out.println("Enter the AccountNumber:");
        account.setAccountNumber(sc.nextLine());
        System.out.println("Enter the Balance:");
        account.setBalance(sc.nextDouble());
        System.out.println("DepositAmount:");
        double amount=sc.nextDouble();
        account.deposit(amount);
        account.checkbalance();
        System.out.println("WithDrawAmount:");
        double WithDrawAmount=sc.nextDouble();
        account.withdraw(WithDrawAmount);
        account.checkbalance();
        System.out.println("Account Number:"+account.getAccountNumber());
        System.out.println("Balance:"+account.getBalance());
    }
}

