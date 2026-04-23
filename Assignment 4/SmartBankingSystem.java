import java.util.*;

interface BankService {
    void deposit(double amount);
    void withdraw(double amount);
}

class Account {
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(int accountNumber, String accountHolderName, String balanceStr) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        try {
            this.balance = Double.parseDouble(balanceStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid balance input, setting to 0");
            this.balance = 0;
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public String generateSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- Account Summary ---\n");
        sb.append("Account Number: ").append(accountNumber).append("\n");
        sb.append("Name: ").append(accountHolderName).append("\n");
        sb.append("Balance: ").append(balance).append("\n");
        return sb.toString();
    }
}

class SavingsAccount extends Account implements BankService {

    public SavingsAccount(int accountNumber, String accountHolderName, String balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nSavings Account");
        super.displayDetails();
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void deposit(double amount, double bonus) {
        deposit(amount);
        balance += bonus;
        System.out.println("Bonus added: " + bonus);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
    }
}

class CurrentAccount extends Account implements BankService {

    public CurrentAccount(int accountNumber, String accountHolderName, String balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nCurrent Account");
        super.displayDetails();
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
    }
}

public class SmartBankingSystem {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Account Number:");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Balance (String):");
            String balance = sc.nextLine();

            System.out.println("1. Savings  2. Current");
            int type = sc.nextInt();

            Account acc;

            if (type == 1) {
                acc = new SavingsAccount(accNo, name, balance);
            } else {
                acc = new CurrentAccount(accNo, name, balance);
            }

            acc.displayDetails();

            BankService service = (BankService) acc;

            System.out.println("Enter deposit amount:");
            double dep = sc.nextDouble();
            service.deposit(dep);

            System.out.println("Enter withdraw amount:");
            double wd = sc.nextDouble();
            service.withdraw(wd);

 
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).deposit(1000, 100);
            }

            System.out.println(acc.generateSummary());

        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}