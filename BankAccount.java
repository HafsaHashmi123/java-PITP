import java.util.Scanner;

public class SimpleBankSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        acc.setAccountHolderName(input.nextLine());

        System.out.print("Enter Account Number: ");
        acc.setAccountNumber(input.nextLine());

        System.out.print("Enter Initial Balance: ");
        acc.setBalance(input.nextDouble());

        acc.displayAccountInfo();

    }
}
class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Setters
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public void setAccountNumber(String number) {
        this.accountNumber = number;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative! Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("\n--- Account Created Successfully ---");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
    }
}

