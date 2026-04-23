import java.util.*;

public class WeeklyWorkHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

       
        int[][] hours = new int[n][];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of working days for Employee " + (i + 1) + ": ");
            int days = sc.nextInt();

           
            hours[i] = new int[days];

            System.out.println("Enter working hours:");
            for (int j = 0; j < days; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                hours[i][j] = sc.nextInt();
            }
        }

      
        System.out.println("\nEmployee Work Hours:");
        for (int i = 0; i < n; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < hours[i].length; j++) {
                System.out.print(hours[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}