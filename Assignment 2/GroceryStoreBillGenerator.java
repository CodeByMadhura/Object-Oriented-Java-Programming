import java.util.*;

class Grocery{
	private String name;
	private int quantity;
	private double price;
	
	public Grocery(String name, int quantity, double price){
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public double getTotal(){
		return quantity * price;
	}
	
	public String getName(){
		return name;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public double getPrice(){
		return price;
	}
}

public class GroceryStoreBillGenerator{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Grocery> list = new ArrayList<>();
		
		System.out.println("Enter the Grocery Size: ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i=0; i<n; i++){
			System.out.println("Item " + (i + 1) + " details: ");
			
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Quantity: ");
			int quantity = sc.nextInt();
			
			System.out.println("Enter Price: ");
			double price = sc.nextDouble();
			
			sc.nextLine();
			
			Grocery g = new Grocery(name, quantity, price);
			list.add(g);
		}
		
		double totalBill = 0.0;
		
		System.out.println("===== Bill ====== ");
		System.out.println("Item\tQty\tPrice\tTotal");
		
		for(Grocery g : list){
			double itemTotal = g.getTotal();
			totalBill += itemTotal;
			
			System.out.println(g.getName()+"\t"+g.getQuantity()+"\t"+g.getPrice()+"\t"+g.getTotal());
		}
		
		double discount = 0;
		if(totalBill > 3000 ){
			discount = totalBill * 0.10;
		}
		
		double finalBill = totalBill - discount;
		
		System.out.println("-----------------------");
		System.out.println("Total Bill: " + totalBill);
		System.out.println("Discount: " + discount);
		System.out.println("Final Amount: " + finalBill);
		
		sc.close();
	}
}