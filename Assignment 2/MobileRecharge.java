import java.util.*;

class MobileRecharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Mobile Number: ");
        String mobileNumber = sc.nextLine();

        System.out.print("Enter Recharge Amount: ");
        int amount = sc.nextInt();

        String validity = "";

        switch (amount) {
            case 199:
                validity = "28 days";
                break;

            case 399:
                validity = "56 days";
                break;

            case 599:
                validity = "84 days";
                break;

            default:
                System.out.println("Invalid Recharge Plan!");
                return;
        }

        System.out.println("\n Recharge Successful!");
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Recharge Amount: Rs. " + amount);
        System.out.println("Validity: " + validity);

        sc.close();
    }
}