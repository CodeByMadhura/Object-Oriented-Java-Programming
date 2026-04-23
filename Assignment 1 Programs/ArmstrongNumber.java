import java.util.*;

public class ArmstrongNumber{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int original = num;
		int digit = 0;
		int sum = 0;
		int digitCube = 0;
		
		
		while(num != 0){
			digit = num % 10;
			digitCube = digit * digit * digit;
			sum = sum + digitCube;
			
			num = num / 10;
			
		}
		
		if(original == sum){
			System.out.println("The given number is Armstrong Number.");
		}else{
			System.out.println("The given number is not an Armstrong Number.");
		}
		
	}
	
	
}