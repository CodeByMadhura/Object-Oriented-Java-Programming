import java.util.*;

class ATM{
    private double balance;

    public ATM(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Amount cannot be negative.");
            return;
        }

        balance += amount;
        System.out.println("Amount is deposited.");
    }

    public void withdraw(double amount){
        if(amount < 0){
            System.out.println("Amount cannot be negative.");
            return;
        }

        if(amount > balance){
            System.out.println("Balance is insufficient.");
            return;
        }

        balance -= amount;
        System.out.println("Amount is withdrawn.");
    }
}

public class ATMSimulation{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM(5000.0);

        int choice;
        do{
            System.out.println("==========================");
            System.out.println("ATM Machine Menu: ");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit Money ");
            System.out.println("3. Withdraw Money ");
            System.out.println("4. Exit ");
            System.out.println("===========================");
            System.out.println("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Balance: " + atm.getBalance());
                    break;

                case 2:
                    System.out.println("Enter Amount: ");
                    double amount = sc.nextDouble();
                    atm.deposit(amount);
                    break;

                case 3:
                    System.out.println("Enter Amount: ");
                    double amount1 = sc.nextDouble();
                    atm.withdraw(amount1);
                    break;

                case 4:
                    System.out.println("Exit.........");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }while(choice != 4);

        sc.close();
    }
}