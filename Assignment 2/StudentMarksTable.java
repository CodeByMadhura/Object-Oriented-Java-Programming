import java.util.*;

public class StudentMarksTable{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		double marks[][] = new double[3][3];
		
		System.out.println("Enter Marks of 3 Students: ");

        for(int i=0; i < 3; i++){
			for(int j=0; j < 3; j++){
				marks[i][j] = sc.nextDouble();
			}
		}	
		
		 for(int i=0; i < 3; i++){
			for(int j=0; j < 3; j++){
				System.out.print(marks[i][j] + " " );
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");

       double output[][] = new double[3][2];	
	   
	   System.out.println("Total Marks & Average ");


System.out.println(" ");	   
		
		
		for(int i=0; i<3; i++){
			double sum = 0;
			for(int j=0; j<3; j++){
				sum += marks[i][j];	
			}
			output[i][0] = sum;
			output[i][1] = sum / 3.0 ;			
		}
		
		for(int i=0; i<3; i++){
			for(int j=0; j<2; j++){
				System.out.print(output[i][j]+ " ");
			}
			
			System.out.println(" ");
		}

		System.out.println(" ");
		
	}
}