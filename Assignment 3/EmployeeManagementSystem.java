import java.util.*;

class Employee{
   private int empId;
   private String ename;
   private int salary;
   static int totalEmployees = 0;

  public Employee(int empId, String ename, int salary ){
	  this.empId = empId;
	  this.ename = ename;
	  this.salary = salary;
	  totalEmployees++;
  }  

  public int getEmpId(){
	  return empId;
  } 

  public String getEname(){
	  return ename;
  }  
  
  public int getSalary(){
	  return salary;
  }
  
  public void setEmpId(int empId){
	  this.empId = empId;
  }
  
  public void setEname(String ename){
	  this.ename = ename;
  }
  
  public void setSalary(int salary){
	  this.salary = salary;
  }
  
 public void updateSalary(int newSalary) {
        salary = newSalary;
    }

    public void updateSalary(double allowancePercent) {
        salary = salary + (int)(salary * allowancePercent / 100);
    }
  
  public void display(){
	  System.out.println("Employee ID: " + empId);
	  System.out.println("Employee Name: " + ename);
	  System.out.println("Salary: " + salary);
  }
  
    public static void showTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}


public class EmployeeManagementSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();
		
		System.out.println("Enter Number of employees: ");
		int n = sc.nextInt();
		
		for(int i=0; i < n ;i++){
			
			System.out.println("Details of Employee " + (i + 1) + " : ");
			
			System.out.print("Employee ID: " );
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Employee Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: " );
			int sal = sc.nextInt();
			
			sc.nextLine();
			
			Employee e = new Employee(id, name, sal);
			
			 e.updateSalary(10.0);
			
			employees.add(e);
						
		}
		
		
		System.out.println("------ Employee Details -------");
		
		for(Employee e : employees){
			e.display();
		}
		
		Employee.showTotalEmployees();
		
		
	}
}