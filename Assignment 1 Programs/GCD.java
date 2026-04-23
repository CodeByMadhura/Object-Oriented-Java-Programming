import java.util.*;

public class GCD{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number : ");
	int num1 = sc.nextInt();
	System.out.println("Enter the second number : ");
	int num2 = sc.nextInt();
	
	int gcd = 1;
	
	int small = (num1 > num2) ? num1 : num2;
	
	for(int i = 1; i <= small; i++){
	  if(num1 % i == 0 && num2 % i == 0){
	        gcd = i;
	  }
	
	}
	
	System.out.println("GCD of " + num1 + " " + num2 + " is " + gcd);
	
	}

}