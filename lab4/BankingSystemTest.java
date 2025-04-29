import java.util.ArrayList;
import java.util.List;

// Interface Account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    double viewBalance();
}

// SavingsAccount class implementing Account
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}

// CurrentAccount class implementing Account
class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Overdraft limit exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for current account.");
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}

// Bank class to manage accounts
class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    public void displayAllBalances() {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("Account " + (i + 1) + " Balance: " + accounts.get(i).viewBalance());
        }
    }
}

// Main class to test the program
public class BankingSystemTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000, 5); // Initial balance and interest rate
        CurrentAccount currentAccount = new CurrentAccount(2000); // Initial balance

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        savingsAccount.deposit(500);
        savingsAccount.calculateInterest();
        savingsAccount.withdraw(200);

        currentAccount.deposit(1000);
        currentAccount.withdraw(2500);
        currentAccount.calculateInterest();

        System.out.println("\n--- All Account Balances ---");
        bank.displayAllBalances();
    }
}