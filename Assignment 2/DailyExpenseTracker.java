import java.util.*;

public class DailyExpenseTracker{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int expenses[] = new int[7];
        
        System.out.println("Enter expenses for 7 days:");
        
        for(int i = 0; i < expenses.length; i++){
            expenses[i] = sc.nextInt();
        }
        
        int totalExpense = 0;
        
        int max = expenses[0];
        int min = expenses[0];
        int maxDay = 0;
        int minDay = 0;
        
        for(int i = 0; i < expenses.length; i++){
            
            totalExpense += expenses[i];
            
            if(expenses[i] > max){
                max = expenses[i];
                maxDay = i;
            }
            
            if(expenses[i] < min){
                min = expenses[i];
                minDay = i;
            }
        }
        
        double average = totalExpense / 7.0;
        
        System.out.println("\nTotal Expense: " + totalExpense);
        System.out.println("Average Expense: " + average);
        
        System.out.println("Highest Expense: " + max + " on Day " + (maxDay + 1));
        System.out.println("Lowest Expense: " + min + " on Day " + (minDay + 1));
    }
}