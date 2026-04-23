import java.util.*;

public class ExpressionCalculator{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter c: ");
		int c = sc.nextInt();
		sc.nextLine();
		
		int val = (a + b) * c;
		System.out.println("Tne value of (a + b) * c is " + val);
		
		boolean val1 = a > b && b > c;
		System.out.println("The value of a > b && b > c is "+ val1);
		
		int val2 = a % b;
		System.out.println("The value of a % b is " + val2);
		
		
	}
}