import java.util.*;

public class SalaryConverter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the salary: ");
		double sal = sc.nextDouble();
		
		int sal1 = (int) sal;
		System.out.println("Salary = " + sal1);
		
		float sal2 = (float) sal;
	    System.out.println("Salary = " + sal2);
	}
}