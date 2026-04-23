import java.util.Scanner;

public class ElectricityBill{
	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Customer Name: ");
	String cname = sc.nextLine();
	
	System.out.print("Enter Customer Number: ");
	int cno = sc.nextInt();
	
	System.out.print("Enter Units Consumed: ");
	int units = sc.nextInt();
	
	double bill = 0;
	double surcharge = 0;
	
	if(units <= 100){
		bill = units * 5;
	}else if(units <= 200){
		bill =(100 * 5) + (units - 100) * 7;
	}else{
		bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
	}
	
	if(bill > 1500){
		surcharge = bill * 0.05;
		bill = bill + surcharge;
	}
	
	System.out.println("");
	System.out.println("Customer Name: " + cname);
	System.out.println("Customer Number: " + cno);
	System.out.println("Units Consumed: " + units);
	System.out.println("Surcharge: " + surcharge);
	System.out.println("Bill: " + bill);

		
	}
	
	

}