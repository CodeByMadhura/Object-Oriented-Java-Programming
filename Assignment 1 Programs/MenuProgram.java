import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Addition = " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("Subtraction = " + (x - y));
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 3);
    }
}