import java.util.*;

public class RestaurantSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int quantity;
        double total = 0;
        char more;

        do {
            System.out.println("\n===== RESTAURANT MENU =====");
            System.out.println("1. Pizza       - Rs. 200");
            System.out.println("2. Burger      - Rs. 100");
            System.out.println("3. Pasta       - Rs. 150");
            System.out.println("4. Sandwich    - Rs. 80");
            System.out.println("5. Coffee      - Rs. 50");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 6) {
                break;
            }

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();

            switch (choice) {
                case 1:
                    total += quantity * 200;
                    System.out.println("Pizza added to order.");
                    break;

                case 2:
                    total += quantity * 100;
                    System.out.println("Burger added to order.");
                    break;

                case 3:
                    total += quantity * 150;
                    System.out.println("Pasta added to order.");
                    break;

                case 4:
                    total += quantity * 80;
                    System.out.println("Sandwich added to order.");
                    break;

                case 5:
                    total += quantity * 50;
                    System.out.println("Coffee added to order.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to order more? (y/n): ");
            more = sc.next().charAt(0);

        } while (more == 'y' || more == 'Y');


        System.out.println("\n===== BILL =====");
        System.out.println("Total Amount: Rs. " + total);

        sc.close();
    }
}