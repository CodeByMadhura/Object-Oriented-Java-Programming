import java.util.*;

public class LCM{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number : ");
	int num1 = sc.nextInt();
	System.out.println("Enter the second number : ");
	int num2 = sc.nextInt();
	
	
	int large = (num1 > num2) ? num1 : num2;
	
	while(true){
	  if(large % num1 == 0 && large % num2 == 0){
			break;
	  }
	  
	  large++;
	
	}
	
	System.out.println("LCM of " + num1 + " " + num2 + " is " + large);
	
	}

}