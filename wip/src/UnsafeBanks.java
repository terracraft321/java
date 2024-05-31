import java.util.*;

// Bank class representing a bank with an ID and balance
class Bank {
    private int id;
    private double balance;

    public Bank(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    // Method to borrow money from another bank
    public void borrowFrom(Bank otherBank, double amount, int[][] borrowers) {
        if (otherBank != this) {
            if (otherBank.getBalance() >= amount) {
                otherBank.balance -= amount;
                this.balance += amount;
                borrowers[this.id - 1][otherBank.id - 1] = 1; // Mark as unsafe borrowing
                System.out.println("Bank " + this.id + " borrowed $" + amount + " from Bank " + otherBank.id);
            } else {
                System.out.println("Bank " + otherBank.id + " does not have enough funds to lend to Bank " + this.id);
            }
        } else {
            System.out.println("Banks cannot borrow from themselves.");
        }
    }
}

public class UnsafeBanks {
    public static void main(String[] args) {
        // Create three banks with initial balances
        Bank bank1 = new Bank(1, 100000);
        Bank bank2 = new Bank(2, 150000);
        Bank bank3 = new Bank(3, 200000);

        // Two-dimensional array to indicate unsafe borrowing
        int[][] borrowers = new int[3][3];

        // Bank 1 borrows from Bank 2
        bank1.borrowFrom(bank2, 50000, borrowers);

        // Bank 2 borrows from Bank 3
        bank2.borrowFrom(bank3, 100000, borrowers);

        // Bank 3 tries to borrow from Bank 1 (but fails due to insufficient funds)
        bank3.borrowFrom(bank1, 250000, borrowers);

        // Display final balances
        System.out.println("Final balances:");
        System.out.println("Bank 1 balance: $" + bank1.getBalance());
        System.out.println("Bank 2 balance: $" + bank2.getBalance());
        System.out.println("Bank 3 balance: $" + bank3.getBalance());

        // Display borrowers matrix
        System.out.println("\nUnsafe borrowing matrix:");
        for (int[] row : borrowers) {
            System.out.println(Arrays.toString(row));
        }
    }
}
