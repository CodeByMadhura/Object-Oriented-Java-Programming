import java.util.*;


public class FinancialCalculator{
	
	public static <T extends Number> void calculate(T[] data){
		double sum = 0;
		
		for(T item : data){
			sum += item.doubleValue();
		}
		
		double average = sum / data.length;
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("-----------------------------");
	}
	
	
	public static void main(String[] args){
		
		Integer[] transactions = {100,200,300,400};
		System.out.println("Transaction Date: ");
		calculate(transactions);
		
		Double[] salaries = {25000.5, 30000.75, 40000.25};
		System.out.println("Salaty Data: ");
		calculate(salaries);
		
	}
}