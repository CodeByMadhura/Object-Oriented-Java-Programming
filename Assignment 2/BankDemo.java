import java.util.*;

class BankAccount{
	private int accNo;
	private String name;
	private double balance;
	
	public BankAccount(){
		this(1234,"Unknown",500.0);
	}
	
	public BankAccount(int accNo, String name){
		this.accNo = accNo;
		this.name = name;
		this.balance = 1000.0;
	}
	
	public BankAccount(int accNo, String name, double balance){
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void displayAccountDetails(){
		System.out.println("Account Number: " + accNo);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
		System.out.println("");
	}
}

public class BankDemo{
  public static void main(String args[]){
	  
	  BankAccount b1 = new BankAccount();
	  BankAccount b2 = new BankAccount(5678,"Madhura Joshi");
	  BankAccount b3 = new BankAccount(2378,"Anjali Joshi",50000.0);
	  
	  b1.displayAccountDetails();
	  b2.displayAccountDetails();
	  b3.displayAccountDetails();
	  
	  
	  
  
  }
}