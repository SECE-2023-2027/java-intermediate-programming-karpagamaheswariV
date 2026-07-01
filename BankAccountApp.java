import java.util.Scanner;

class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount <= 0)
            System.out.println("Invalid Deposit Amount");
        else
            balance += amount;
    }

    public void withdraw(double amount) {

        if (amount > balance)
            System.out.println("Insufficient Funds");
        else
            balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, name, balance);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Current Balance: " + account.getBalance());

        sc.close();
    }
}