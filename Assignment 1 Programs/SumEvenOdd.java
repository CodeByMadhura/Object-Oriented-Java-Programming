import java.util.Scanner;

public class SumEvenOdd{
	
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter n : ");
	int n = sc.nextInt();
	
	int sumEven = 0, sumOdd = 0;
	
	for(int i=1; i <= n; i++){
		
		if(i % 2 == 0){
			
			sumEven = sumEven + i;
			
		} else{
			
			sumOdd = sumOdd + i;
		}
		
	}
		
	System.out.println("The sum of even numbers is " + sumEven);
	System.out.println("The sum of odd numbers is " + sumOdd);
		
	}
	
	
}