import java.util.*;

class Payment {
    protected int paymentId;
    protected double amount;

    public Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public void displayPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
    }
}

class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(int paymentId, double amount, String cardNumber) {
        super(paymentId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void displayPayment() {
        System.out.println("Credit Card Payment");
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("----------------------");
    }
}

class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(int paymentId, double amount, String upiId) {
        super(paymentId, amount);
        this.upiId = upiId;
    }

    @Override
    public void displayPayment() {
        System.out.println("UPI Payment");
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("UPI ID: " + upiId);
        System.out.println("----------------------");
    }
}

public class PaymentGenericsDemo {

    public static void displayAllPayments(List<? extends Payment> list) {
        for (Payment p : list) {
            p.displayPayment();
        }
    }

    public static void main(String args[]) {

        ArrayList<CreditCardPayment> creditList = new ArrayList<>();
        ArrayList<UPIPayment> upiList = new ArrayList<>();

        creditList.add(new CreditCardPayment(1, 5000, "1234-5678-9012"));
        creditList.add(new CreditCardPayment(2, 7500, "9876-5432-1098"));

        upiList.add(new UPIPayment(3, 1500, "user@upi"));
        upiList.add(new UPIPayment(4, 2500, "abc@upi"));

        System.out.println("---- Credit Card Payments ----");
        displayAllPayments(creditList);

        System.out.println("---- UPI Payments ----");
        displayAllPayments(upiList);
    }
}