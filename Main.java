class UserAccount {
    String username;
    String email;
    int loyaltyPoints;

    // 1. Constructor for "Guest" users (No parameters)
    UserAccount() {
        this.username = "Guest";
        this.email = "Not Provided";
        this.loyaltyPoints = 0;
    }

    // 2. Constructor for "Basic" sign-up (Two parameters)
    UserAccount(String username, String email) {
        this.username = username;
        this.email = email;
        this.loyaltyPoints = 0; // Default points for new users
    }

// 3. Constructor for "Migrated/Pro" users (Three parameters)
    UserAccount(String username, String email, int loyaltyPoints) {
        this.username = username;
        this.email = email;
        this.loyaltyPoints = loyaltyPoints;
    }

    void displayInfo() {
        System.out.println("User: " + username + " | Email: " + email + " | Points: " + loyaltyPoints);
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating objects using different constructors
        UserAccount guest = new UserAccount();
        UserAccount basicUser = new UserAccount("Aakash", "aakash@google.com");
        UserAccount proUser = new UserAccount("Bheem", "bheem@google.com", 500);

        // Displaying details
        System.out.println("--- Account Details ---");
        guest.displayInfo();
        basicUser.displayInfo();
        proUser.displayInfo();
    }
}
