import java.util.*;

class Student{
	private String name;
	private int rollNo;
	static int count = 0;
	
	public Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
		count++;
	}
	
	public static int totalStudent(){
		return count;
	}
	
}

public class StudentCounterSystem{
	
	public static void main(String[] args){
		
		Student s1 = new Student("Madhura",45);
		Student s2 = new Student("Suyog", 55);
		Student s3 = new Student("Kavya", 65);
		
		System.out.println("Total Students = " + Student.totalStudent());
		
	}

}