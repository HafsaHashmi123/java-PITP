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
