import java.util.Scanner;

public class ATMInterface {
    private static double balance = 5000; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the ATM system!");
        
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }
    
    private static void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw:");
        double amount = scanner.nextDouble();
        
        if (amount > balance) {
            System.out.println("Insufficient funds. Please try again.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn $" + amount);
        }
    }
    
    private static void depositMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        double amount = scanner.nextDouble();
        
        balance += amount;
        System.out.println("Successfully deposited $" + amount);
    }
}
