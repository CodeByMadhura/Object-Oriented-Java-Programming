import java.util.*;

class Calculator{
	
	public int calculate(int a, int b){
		return a+b;
	}
	
	public double calculate(double a, double b){
		return a + b;
	}
	
	public int calculate(int a, int b, int c){
		return a + b + c;
	}
	
	
	
}

public class CalculatorDemo{
 
 public static void main(String args[]){
 
    Calculator c1 = new Calculator();
	
	System.out.println("Sum = " + c1.calculate(4,5));
	System.out.println("Sum = " + c1.calculate(4.5,7.75));
	System.out.println("Sum = " + c1.calculate(6,7,8));
  
 
 }
 
 }