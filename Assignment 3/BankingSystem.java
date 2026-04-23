import java.util.Scanner;

class AccDetails{

   private String accNo;
   private String holderName;
   private double balance;
   
    static int totalAccounts = 0;
   
   public AccDetails(String accNo, String holderName, double balance){
	   this.accNo = accNo;
	   this.holderName = holderName;
	   this.balance = balance;
	   totalAccounts++;
   }
   
   public String getAccNo(){
	   return accNo;
   }
   
   public String getHolderName(){
	   return holderName;
   }
   
    public double getBalance(){
	   return balance;
   }
   
   public void setAccNo(String accNo){
	   this.accNo = accNo;
	   
   }
   
      public void setHolderName(String holderName){
	   this.holderName = holderName;
	   
   }
   
      public void setBalance(double balance){
	   this.balance = balance;
	   
   }
   
   
   public void depositAmt(int amt){
	   if(amt < 0){
		   System.out.println("Ammount cannot be negative.");
		   return;
	   }
	   
	   balance += amt;
	   System.out.println("Cash Deposited Successfully.");  
   }
   
      public void depositAmt(double amt, String mode) {
        if (amt <= 0) {
            System.out.println("Amount cannot be negative.");
            return;
        }
        balance += amt;
        System.out.println("Online Deposit Successful via " + mode);
    }
   
   public void withdrawAmt(int amt){
	   if(amt < 0){
		   System.out.println("Ammount cannot be negative.");
		   return;
	   } else if(amt > balance ){
		   System.out.println("Ammount cannot be greater than Balance.");
		   return;
	   }
	   
	      balance -= amt;
	 System.out.println("Withdrawal Successful.");
   }
   
    public void display() {
		System.out.println("Updated Account Details: " );
        System.out.println("Account Number: " + accNo);
        System.out.println("Holder Name: " + holderName);
		System.out.println("Balance: " + balance);
    }
   
   

}


public class BankingSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total no. of accounts: ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		  AccDetails[] accounts = new AccDetails[n];
		
		for(int i=0; i < n; i++){
			System.out.println("Account Details " + (i + 1) + ":");
			
			System.out.println("Enter Account Number: " );
			String accNo = sc.nextLine();
			System.out.println("Enter Account Holder Name: " );
			String holderName = sc.nextLine();
			System.out.println("Enter Account Balance: " );
			double balance = sc.nextDouble();
			
			accounts[i] = new AccDetails(accNo, holderName, balance);
			
			
		}
		
		
		     for (int i = 0; i < n; i++) {
            accounts[i].depositAmt(1000); 
            accounts[i].depositAmt(500.5, "UPI"); 
            accounts[i].withdrawAmt(300);
        }

     
        System.out.println("\n===== Account Details =====");
        for (AccDetails acc : accounts) {
            acc.display();
        }
		
		System.out.println("\nTotal Accounts: " + AccDetails.totalAccounts);
		
		
	}
}