import java.util.*;

class Order {
    private int orderId;
    private String cname;
    private String[] items;
    private int[] prices;
    private int totalPrice;
    private double totalBill;

    public Order(int orderId, String cname, String[] items, int[] prices) {
        this.orderId = orderId;
        this.cname = cname;
        this.items = items;
        this.prices = prices; 
    }

    public void calTotalPrice() {
        totalPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            totalPrice += prices[i];
        }
    }

    public void calTotalBill(double gst) {
        totalBill = totalPrice + (totalPrice * gst / 100);
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCname() {
        return cname;
    }

    public String[] getItems() { 
        return items;
    }

    public int[] getPrices() { 
        return prices;
    }

    public void displayOrderDetails() {
        System.out.println("Order Id: " + orderId);
        System.out.println("Customer Name: " + cname);

        System.out.println("Items:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " " + prices[i]);
        }

        System.out.println("Total Price: " + totalPrice);
        System.out.println("Total Bill (with GST): " + totalBill);
        System.out.println("---------------------------");
    }
}

public class OnlineOrderSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();

        System.out.print("Total Number of Orders: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Order " + (i + 1) + " Details:");

            System.out.print("Order ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Customer Name: ");
            String cname = sc.nextLine();

            System.out.print("Number of Items: ");
            int count = sc.nextInt();
            sc.nextLine();

            String[] items = new String[count];
            int[] prices = new int[count];

            for (int j = 0; j < count; j++) {
                System.out.print("Item Name: ");
                items[j] = sc.nextLine();

                System.out.print("Item Price: ");
                prices[j] = sc.nextInt();
                sc.nextLine();
            }

            Order o = new Order(id, cname, items, prices); 

            o.calTotalPrice();  
            o.calTotalBill(18);

            orders.add(o);
        }

        System.out.println("\n------- Order Details -----------");

        for (Order o : orders) {
            o.displayOrderDetails();
        }
    }
}