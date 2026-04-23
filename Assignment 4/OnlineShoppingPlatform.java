import java.util.*;

class Product {
    private int productId;
    private String productName;
    private String price;

    public Product(int productId, String productName, String price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double convertPrice() {
        return Double.parseDouble(price);
    }
}

class Order {
    private String customerName;
    private Product products[];

    public Order(String customerName, Product products[]) {
        this.customerName = customerName;
        this.products = products;
    }

    public double calculateBill() {
        double totalPrice = 0;

        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].convertPrice();
        }

        return totalPrice;
    }

    public double calculateBill(double discount) {
        double oldPrice = calculateBill();
        double disAmt = oldPrice * (discount / 100.0);

        return (oldPrice - disAmt);
    }

    public String generateBill() {
        StringBuilder bill = new StringBuilder();

        bill.append("Customer Name: ").append(customerName).append("\n");
        bill.append("Products:\n");

        double total = 0;

        for (Product p : products) {
            bill.append(p.getProductName())
                .append(" Rs. ")
                .append(p.convertPrice())
                .append("\n");

            total += p.convertPrice();
        }

        bill.append("Total Amount: Rs. ").append(total);

        return bill.toString();
    }
}

interface Payment {
    void pay(double amount);
    void refund(double amount);
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI.");
    }

    public void refund(double amount) {
        System.out.println("Refund of Rs. " + amount + " processed via UPI.");
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " done using Card.");
    }

    public void refund(double amount) {
        System.out.println("Refund of Rs. " + amount + " processed via Card.");
    }
}

public class OnlineShoppingPlatform {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter number of products: ");
            int n = sc.nextInt();
            sc.nextLine();

            if (n <= 0) {
                throw new Exception("Products count must be greater than 0");
            }

            Product[] products = new Product[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for product " + (i + 1));

                System.out.println("Product ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Product Name: ");
                String name = sc.nextLine();

                System.out.println("Price (String): ");
                String price = sc.nextLine();

                products[i] = new Product(id, name, price);
            }

            System.out.println("Enter Customer Name: ");
            String customerName = sc.nextLine();

            Order order = new Order(customerName, products);

            double total = order.calculateBill();

            System.out.println("Enter discount % (0 if none): ");
            double discount = sc.nextDouble();

            double finalAmount = order.calculateBill(discount);

            System.out.println("----- Bill --------");
            System.out.println(order.generateBill());

            System.out.println("Final Payable Amount: Rs. " + finalAmount);

            System.out.println("Choose Payment Method: ");
            System.out.println("1. UPI");
            System.out.println("2. Card");

            int choice = sc.nextInt();

            Payment payment;

            switch (choice) {
                case 1:
                    payment = new UPIPayment();
                    break;
                case 2:
                    payment = new CardPayment();
                    break;
                default:
                    throw new Exception("Invalid payment option");
            }

            payment.pay(finalAmount);

        } catch (NumberFormatException e) {
            System.out.println("Invalid price format!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}