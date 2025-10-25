import java.util.Scanner;
class Account {
    private String username;
    private String password;

    // Method to assign username
    public void setUsername(String username) {
        this.username = username;
    }

    // Method to assign password
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
import java.util.Scanner;

public class EncapsulationLoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account user = new Account();

        System.out.println("=== User Registration ===");
        System.out.print("Create username: ");
        user.setUsername(input.nextLine());

        System.out.print("Create password: ");
        user.setPassword(input.nextLine());

        System.out.println("\n=== Login ===");
        System.out.print("Enter username: ");
        String enteredUser = input.nextLine();

        System.out.print("Enter password: ");
        String enteredPass = input.nextLine();

        if (enteredUser.equals(user.getUsername()) && enteredPass.equals(user.getPassword())) {
            System.out.println("Access granted. Welcome, " + user.getUsername() + "!");
        } else {
            System.out.println("Access denied. Please check your credentials.");
        }

        input.close();
    }
}



