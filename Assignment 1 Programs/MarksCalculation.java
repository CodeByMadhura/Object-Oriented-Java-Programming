import java.util.Scanner;

public class MarksCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        double percentage;

        System.out.println("Enter marks of 5 subjects:");

        for(int i = 1; i <= 5; i++) {
            int marks = sc.nextInt();
            total += marks;
        }

        percentage = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);

        if(percentage >= 75) {
            System.out.println("Grade: A");
        } else if(percentage >= 60) {
            System.out.println("Grade: B");
        } else if(percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}