import java.util.Scanner;

public class SwapNumbers{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("a = " + a + " " +"b = " + b);
		
	}
	
}