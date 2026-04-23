import java.util.*;

public class BusBookingSystem {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    
        boolean[] seats = new boolean[10];
        
        while (true) {
       
            System.out.println("\n===== BUS TICKET BOOKING SYSTEM =====");
            System.out.println("1. View Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Seat");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                
               
                case 1:
                    System.out.println("\nSeat Status:");
                    for (int i = 0; i < seats.length; i++) {
                        if (seats[i] == false) {
                            System.out.println("Seat " + (i + 1) + " : Available");
                        } else {
                            System.out.println("Seat " + (i + 1) + " : Booked");
                        }
                    }
                    break;
                
            
                case 2:
                    System.out.print("Enter seat number to book (1-10): ");
                    int bookSeat = sc.nextInt();
                    
                    if (bookSeat < 1 || bookSeat > 10) {
                        System.out.println("Invalid seat number!");
                    } 
                    else if (seats[bookSeat - 1] == true) {
                        System.out.println("Seat already booked!");
                    } 
                    else {
                        seats[bookSeat - 1] = true;
                        System.out.println("Seat " + bookSeat + " booked successfully!");
                    }
                    break;
                
                case 3:
                    System.out.print("Enter seat number to cancel (1-10): ");
                    int cancelSeat = sc.nextInt();
                    
                    if (cancelSeat < 1 || cancelSeat > 10) {
                        System.out.println("Invalid seat number!");
                    } 
                    else if (seats[cancelSeat - 1] == false) {
                        System.out.println("Seat is already available!");
                    } 
                    else {
                        seats[cancelSeat - 1] = false;
                        System.out.println("Seat " + cancelSeat + " cancelled successfully!");
                    }
                    break;
                
                case 4:
                    System.out.println("Thank you for using the system!");
                    sc.close();
                    return; 

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}