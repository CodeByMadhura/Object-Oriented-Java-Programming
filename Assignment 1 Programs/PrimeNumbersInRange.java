import java.util.*;

public class PrimeNumbersInRange{

	public static void main(String args[]){


	for(int i = 1; i <= 100; i++){
		
		boolean flag = true;  

        if(i <= 1) {
                flag = false;      
        }
			
		for(int j = 2; j <= i/2; j++){
			if(i %  j == 0){
			flag = false;
			break;
			}
 
		}
		
			if(flag){
		System.out.print(i + " ");
			}
	
	}

	}

}