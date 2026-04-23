import java.util.*;

class Student{
  private int rollNo;
  private String name;
  private double[] marks;
  private String phone;
  private String email;
  
  
  public Student(int rollNo, String name, double[] marks, String phone, String email){
     this.rollNo = rollNo;
	 this.name = name;
	 this.marks = marks;
	 this.phone = phone;
	 this.email = email;
  }
  
  public double calculateTotal(){
    double total = 0;
	for(double m : marks){
	   total += m;
	}
	
	return total;
  
  }
  
  public double calculateAverage(){
    if(marks.length  == 0){
	   return 0;
	}
	
	return calculateTotal() / marks.length; 
  
  }
  
  
  public void displayResult(){
     System.out.println("Roll No. : " + rollNo);
	 System.out.println("Name : " + name);
	  System.out.println("Phone : " + phone);
	   System.out.println("Email : " + email);
	 System.out.println("Total : " + calculateTotal());
	 System.out.println("Average : " + calculateAverage());
 
  }
  

}


public class StudentERP{


	public static void main(String args[]){
	
	Scanner sc  = new Scanner(System.in);
	
	System.out.println("Enter Number Of Students: ");
	int noOfStudents = sc.nextInt();
	
	Student[] stud = new Student[noOfStudents];
	
	for(int i = 0; i < noOfStudents ; i++){
		
		System.out.println("Enter the details of student " + (i + 1)  );
		
		System.out.println("Enter Student Roll No.: ");
		int rollNo = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Phone: ");
		String phone = sc.nextLine();
		
		System.out.println("Enter Student Email: ");
		String email = sc.nextLine();
		
		System.out.println("Enter Number Of Subjects: ");
		int n = sc.nextInt();
		
		double[] marks = new double[n];
		
		for(int j = 0; j < n ; j++){
			marks[j] = sc.nextDouble();
		}
		
		stud[i] = new Student(rollNo, name, marks, phone, email);
		
		
		
		
	}
	
	System.out.println("\n===== STUDENT RESULTS =====");

        for (Student s : stud) {
            s.displayResult();
        }
	
	
	
	
	}





}