import java.util.*;


public class LeapYear{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

long cal = sc.nextLong();

if(cal % 4 == 0 && cal % 100 != 0){
System.out.println("The given year is leap year.");
}else if(cal % 400 == 0){
System.out.println("The given year is leap year.");
}else{
System.out.println("The given year is not a leap year.");
}

}

}