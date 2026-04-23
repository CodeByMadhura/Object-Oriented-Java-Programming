import java.util.*;

public class LargestDigit{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int digit = 0;
		int largest = 0;
		
		while(num != 0){
			
	    digit = num % 10;
		
		if(digit > largest){
			largest = digit;
		}
		
		num = num / 10;
			
		}
		
		System.out.println("The largest digit is " + largest);
		
		
	}
	
	
}