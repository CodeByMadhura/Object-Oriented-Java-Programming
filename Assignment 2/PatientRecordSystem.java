import java.util.*;

class Patient{
	private int patientId;
	private String patientName;
	private int age;
	private String disease;
	
	public Patient(int patientId, String patientName, int age, String disease){
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.disease = disease;
	}
	
public void checkAge(){
    if(this.age >= 60){
        System.out.println("The patient is Senior Citizen.");
    } else{
        System.out.println("The patient is not a Senior Citizen.");
    }
}
	
	
	public void displayPatientDetails(){
		System.out.println("Patient ID: " + patientId);
		System.out.println("Patient Name: " + patientName);
		System.out.println("Age: " + age);
		System.out.println("Disease: " + disease);
		
		
	}
	
}

public class PatientRecordSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Patient> patients = new ArrayList<>();
		
		System.out.println("Enter Number of Patients: ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i=0; i<n; i++){
			System.out.println("Patient " + (i + 1) + " Details: ");
			
			System.out.print("Patient ID: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Patient Name: ");
			String name = sc.nextLine();
			
			System.out.print("Patient Age: ");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Disease Name: ");
			String disease = sc.nextLine();
			
			
			Patient p = new Patient(id, name, age, disease);
			
			patients.add(p);
			
			
		}
		
		System.out.println("------------------ All Patient Details --------------");
		
		for(Patient p : patients){
			p.displayPatientDetails();
			p.checkAge();   
    System.out.println();
		}
		
		
		
		
	}
}