import java.util.*;

class ContactDetails{

 private String phone;
 private String address;
 
 public ContactDetails(String phone, String Address){
	 this.phone = phone;
	 this.address = address;
 }
 
 public void displayContact(){
	 System.out.println("Phone: " + phone);
	 System.out.println("Address: " + address);
 }
 
}

class Patient{
	private int patientID;
	private String name;
	private int age;
	private String disease;
	private ContactDetails contact;
	
	public Patient(int patientID, String name, int age, String disease, ContactDetails contact){
		this.patientID = patientID;
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.contact = contact;
	}
	
	 public boolean isSeniorCitizen() {
        return age >= 60;
    }
	
	   public void displayPatient() {
        System.out.println("\nPatient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);

        contact.displayContact(); 

        if (isSeniorCitizen()) {
            System.out.println("Status: Senior Citizen");
        } else {
            System.out.println("Status: Normal");
        }
    }
	
	
}


public class HospitalManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();
		
		    for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of patient " + (i + 1));

            System.out.print("Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Disease: ");
            String disease = sc.nextLine();

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();
			
			     ContactDetails contact = new ContactDetails(phone, address);

            Patient p = new Patient(id, name, age, disease, contact);

            patients.add(p);
        }
		
		        System.out.println("\n--- Patient Details ---");

        for (Patient p : patients) {
            p.displayPatient();
        }
		
		        System.out.println("\nTotal Patients: " + patients.size());
    }
}