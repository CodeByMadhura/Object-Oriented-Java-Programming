class Employee{
  private int empId;
  private String name;
  
  static int counter = 0;
  
  public Employee(String name){
     counter++;
	 this.empId = counter;
	 this.name = name;
  }
  
  public void display(){
  System.out.println("Employee ID: " + empId);
  System.out.println("Employee Name: " + name);
  }


}

public class EmployeeIdGenerator{
 public static void main(String args[]){
	 
	   Employee e1 = new Employee("Amit");
        Employee e2 = new Employee("Rahul");
        Employee e3 = new Employee("Sneha");
        
        e1.display();
        System.out.println();
        e2.display();
        System.out.println();
        e3.display();
		
		
 }
}