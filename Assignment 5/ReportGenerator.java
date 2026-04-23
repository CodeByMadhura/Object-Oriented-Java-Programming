import java.util.*;


public class ReportGenerator{
	
	public static <T> void generateReport(T[] data){
		System.out.println("---- Report -----");
		
		for(T item : data){
			System.out.println(item);
		}
		
		System.out.println("-------------------");
	}
	
	public static void main(String args[]){
		
		Double[] sales = {100.5, 2500.75, 3200.0};
		generateReport(sales);
		
		String[] employees = {"Kavya","Parth","Ramya"};
		generateReport(employees);
		
		Integer[] productsIds = {101,102,103};
		generateReport(productsIds);
		
	}
}