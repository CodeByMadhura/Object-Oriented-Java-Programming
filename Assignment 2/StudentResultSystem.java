import java.util.*;

public class StudentResultSystem{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Roll Number: ");
		int roll = sc.nextInt();
		
		int[] marks = new int[5];
		int total = 0;
		
		for(int i = 0; i < 5; i++){
			System.out.println("Enter marks for Subject " + (i + 1) + " : " );
			marks[i] = sc.nextInt();
			total += marks[i];
		}
		
		double average = total / 5.0;
		double percentage = (total / 500.0 ) * 100;
		
		String grade;
		
		if (percentage >= 90 && percentage <= 100) {
    grade = "A";
} else if (percentage >= 75 && percentage <= 89) {
    grade = "B";
} else if (percentage >= 60 && percentage <= 74) {
    grade = "C";
} else if (percentage >= 40 && percentage <= 59) {
    grade = "D";
} else {
    grade = "Fail";
}
		
		
		System.out.println("");
		System.out.println("Student Name: " + name);
		System.out.println("Student Roll No: " + roll);
		System.out.println("Total Marks: " + total);
		System.out.println("Percentage: " + percentage + "%");
		System.out.println("Grade: " + grade);
		
		
	}



}