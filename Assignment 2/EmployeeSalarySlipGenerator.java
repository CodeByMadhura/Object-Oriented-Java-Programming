import java.util.*;

class Employee {
    private int empId;
    private String ename;
    private double basic;


    public Employee(int empId, String ename, double basic) {
        this.empId = empId;
        this.ename = ename;
        this.basic = basic;
    }


    public int getEmpId() {
        return empId;
    }

    public String getEname() {
        return ename;
    }

    public double getBasic() {
        return basic;
    }


    public double calculateNetSalary() {
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double pf = basic * 0.08;

        return basic + hra + da - pf;
    }

   
    public void displaySalarySlip() {
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double pf = basic * 0.08;
        double netSalary = calculateNetSalary();

        System.out.println("\n==============================");
        System.out.println("        SALARY SLIP");
        System.out.println("==============================");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + ename);
        System.out.printf("Basic Salary  : %.2f\n", basic);
        System.out.printf("HRA (20%%)     : %.2f\n", hra);
        System.out.printf("DA (10%%)      : %.2f\n", da);
        System.out.printf("PF (8%%)       : %.2f\n", pf);
        System.out.println("------------------------------");
        System.out.printf("Net Salary    : %.2f\n", netSalary);
        System.out.println("==============================");
    }
}

public class EmployeeSalarySlipGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter total number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Basic Salary: ");
            double basic = sc.nextDouble();

           
            if (basic < 0) {
                System.out.println("Salary cannot be negative. Setting to 0.");
                basic = 0;
            }

            Employee emp = new Employee(id, name, basic);
            employees.add(emp);
        }

   
        System.out.println("\n\n===== ALL EMPLOYEE SALARY SLIPS =====");

        for (Employee emp : employees) {
            emp.displaySalarySlip();
        }

        sc.close();
    }
}