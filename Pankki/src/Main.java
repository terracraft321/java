import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;



class User {
    private String name;
    private String hashedPassword;
    private Account account;

    public User(String name, String password, double initialDeposit) {
        this.name = name;
        this.hashedPassword = hashPassword(password);
        this.account = new Account(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public boolean verifyPassword(String password) {
        return this.hashedPassword.equals(hashPassword(password));
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}

class Account {
    private double balance;

    public Account(double initialDeposit) {
        this.balance = initialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
            return false;
        }
    }
}

class Bank {
    private Map<String, User> users;

    public Bank() {
        this.users = new HashMap<>();
    }

    public void createUser(String name, String password, double initialDeposit) {
        if (!users.containsKey(name)) {
            users.put(name, new User(name, password, initialDeposit));
            System.out.println("User " + name + " created with initial deposit of " + initialDeposit);
        } else {
            System.out.println("User " + name + " already exists.");
        }
    }

    public User getUser(String name) {
        return users.get(name);
    }

    public void deposit(String name, double amount) {
        User user = users.get(name);
        if (user != null) {
            user.getAccount().deposit(amount);
            System.out.println("Deposited " + amount + " to " + name + "'s account. New balance: " + user.getAccount().getBalance());
        } else {
            System.out.println("User " + name + " not found.");
        }
    }

    public void transfer(String fromUser, String toUser, double amount) {
        User userFrom = users.get(fromUser);
        User userTo = users.get(toUser);

        if (userFrom != null && userTo != null) {
            if (userFrom.getAccount().withdraw(amount)) {
                userTo.getAccount().deposit(amount);
                System.out.println("Transferred " + amount + " from " + fromUser + " to " + toUser);
                System.out.println(fromUser + "'s new balance: " + userFrom.getAccount().getBalance());
                System.out.println(toUser + "'s new balance: " + userTo.getAccount().getBalance());
                userFrom.getAccount().withdraw(amount);
            } else {
                System.out.println("Transfer failed. Insufficient funds in " + fromUser + "'s account.");
                // Deposit the amount back to the sender's account
                userFrom.getAccount().deposit(amount);
            }
        } else {
            System.out.println("One or both users not found.");
        }
    }
}

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to the Bank");
            System.out.println("1. Create new account");
            System.out.println("2. Login to existing account");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        createNewAccount();
                        break;
                    case 2:
                        loginToAccount();
                        break;
                    case 3:
                        System.out.println("Thank you for using the Bank. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();  // Consume invalid input
            }
        }
    }

    private static void createNewAccount() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        bank.createUser(name, password, initialDeposit);
    }

    private static void loginToAccount() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        User user = bank.getUser(name);

        if (user != null && user.verifyPassword(password)) {
            while (true) {
                System.out.println("\nHello, " + user.getName());
                System.out.println("1. Deposit money");
                System.out.println("2. Transfer money");
                System.out.println("3. Check balance");
                System.out.println("4. Logout");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        depositMoney(user);
                        break;
                    case 2:
                        transferMoney(user);
                        break;
                    case 3:
                        checkBalance(user);
                        break;
                    case 4:
                        System.out.println("Logging out...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static void depositMoney(User user) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        bank.deposit(user.getName(), amount);
    }

    private static void transferMoney(User fromUser) {
        System.out.print("Enter recipient's name: ");
        String toUser = scanner.nextLine();
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        bank.transfer(fromUser.getName(), toUser, amount);
    }

    private static void checkBalance(User user) {
        System.out.println("Your current balance is: " + user.getAccount().getBalance());
    }
}
/**
 * This program simulates a simple banking system where users can create accounts, deposit and withdraw funds,
 * transfer money between accounts, and check their account balances.
 *
 * The program consists of the following classes:
 * - {@link User}: Represents a user of the banking system.
 *     - Constructor: {@link User#User(String, String, double)} - Constructs a new User object.
 *         - @param name The name of the user.
 *         - @param password The password for the user's account.
 *         - @param initialDeposit The initial deposit amount for the user's account.
 *     - Method: {@link User#getName()} - Returns the name of the user.
 *     - Method: {@link User#getAccount()} - Returns the account associated with the user.
 *     - Method: {@link User#verifyPassword(String)} - Verifies if the provided password matches the user's password.
 *         - @param password The password to verify.
 *
 * - {@link Account}: Represents a bank account.
 *     - Constructor: {@link Account#Account(double)} - Constructs a new Account object.
 *         - @param initialDeposit The initial deposit amount for the account.
 *     - Method: {@link Account#getBalance()} - Returns the current balance of the account.
 *     - Method: {@link Account#deposit(double)} - Deposits funds into the account.
 *         - @param amount The amount to deposit into the account.
 *     - Method: {@link Account#withdraw(double)} - Withdraws funds from the account.
 *         - @param amount The amount to withdraw from the account.
 *
 * - {@link Bank}: Represents a bank with functionality for creating users, depositing, and transferring funds.
 *     - Constructor: {@link Bank#Bank()} - Constructs a new Bank object.
 *     - Method: {@link Bank#createUser(String, String, double)} - Creates a new user account.
 *         - @param name The name of the user.
 *         - @param password The password for the user's account.
 *         - @param initialDeposit The initial deposit amount for the user's account.
 *     - Method: {@link Bank#getUser(String)} - Retrieves a user account by name.
 *         - @param name The name of the user to retrieve.
 *     - Method: {@link Bank#deposit(String, double)} - Deposits funds into a user's account.
 *         - @param name The name of the user.
 *         - @param amount The amount to deposit into the user's account.
 *     - Method: {@link Bank#transfer(String, String, double)} - Transfers funds between user accounts.
 *         - @param fromUser The name of the user initiating the transfer.
 *         - @param toUser The name of the user receiving the transfer.
 *         - @param amount The amount to transfer.
 *
 * - {@link Main}: Main class that contains the entry point of the program.
 *     - Method: {@link Main#main(String[])} - Main method that starts the banking application.
 *     - Method: {@link Main#createNewAccount()} - Prompts the user to create a new account.
 *     - Method: {@link Main#loginToAccount()} - Prompts the user to login to an existing account.
 *     - Method: {@link Main#depositMoney(User)} - Prompts the user to deposit money into their account.
 *         - @param user The user object whose account to deposit into.
 *     - Method: {@link Main#transferMoney(User)} - Prompts the user to transfer money to another account.
 *         - @param fromUser The user object initiating the transfer.
 *     - Method: {@link Main#checkBalance(User)} - Displays the current balance of the user's account.
 *         - @param user The user object whose account balance to check.
 */
