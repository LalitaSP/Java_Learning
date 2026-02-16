
import java.util.Scanner;
// Defining an interface forces all accounts to implement compute()
interface MaintenanceCharge {
    float compute(int years);
}

class Account {
    String name;
    int number;
    int balance;
    String startDate;

    // A constructor makes it easier to assign values
    Account(String name, int number, int balance, String startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }
}

class CurrentAccount extends Account implements MaintenanceCharge {
    CurrentAccount(String name, int number, int balance, String startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public float compute(int n) {
        return (float) (100 * n + 200);
    }
}

class SavingsAccount extends Account implements MaintenanceCharge {
    SavingsAccount(String name, int number, int balance, String startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public float compute(int n) {
        return (float) ((2 * 50 * n) + 50);
    }
}

public class InterfaceTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Current Account\n2. Savings Account");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline left by nextInt()

        System.out.println("Name:");
        String na = sc.nextLine();

        System.out.println("Account Number:");
        int an = sc.nextInt();

        System.out.println("Account Balance:");
        int ab = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter the Start Date (yyyy-mm-dd):");
        String sd = sc.nextLine();

        System.out.println("Enter the Years:");
        int y = sc.nextInt();
         
        if (choice == 1) {
            CurrentAccount obj1 = new CurrentAccount(na, an, ab, sd);
            System.out.printf("Maintenance Charge For Current Account: %.2f%n", obj1.compute(y));
        } else {
            SavingsAccount obj2 = new SavingsAccount(na, an, ab, sd);
            System.out.printf("Maintenance Charge For Savings Account: %.2f%n", obj2.compute(y));
        }
        sc.close();
    }
}