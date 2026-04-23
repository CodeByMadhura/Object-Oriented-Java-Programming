import java.util.*;

public class PerfectNumber{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	
	int original = num;
	int sum = 0;
	
	for(int i = 1; i <  num; i++){
		if(num % i == 0){
			sum = sum + i;
			
		}
	}
	
	if(sum == original){
      System.out.println("The given number is perfect number.");		
	}else{
	  System.out.println("The given number is not a perfect number.");
	}
		
	}

}