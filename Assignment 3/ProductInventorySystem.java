import java.util.*;

class Product{
 
  private int productId;
  private String name;
  private double price;
  private int quantity;
  
  
  public Product(int productId, String name, double price, int quantity){
	  this.productId = productId;
	  this.name = name;
	  this.price = price;
	  this.quantity = quantity;
  }
  
  public int getProductId(){
	  return productId;
  }
  
  public String getName(){
	  return name;
  }
  
  public double getPrice(){
	  return price;
  }
  
  public int getQuantity(){
	  return quantity;
  }
  
  public void setProductId(int productId){
	  this.productId = productId;
  }
  
  public void setName(String name){
	  this.name = name;
  }
  
  public void setPrice(double price){
	  this.price = price;
  }
  
  public void setQuantity(int quantity){
	  this.quantity = quantity;
  }
  
	public double calculateTotalInventory(){
    return price * quantity;
}
  
	public void priceUpdate(double newPrice){
    this.price = newPrice;
    System.out.println("Product price updated.");
}
  
	public void priceUpdate(int discount){
    this.price = price - (price * discount / 100);
    System.out.println("Discount applied.");
}
  
  public void displayProduct(){
	  System.out.println("Product ID: " + productId);
	  System.out.println("Name: " + name);
	  System.out.println("Price: " + price);
	  System.out.println("Quantity: " + quantity);
  }

}


public class ProductInventorySystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> products = new ArrayList<>();
		
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i =0; i < n ; i++){
			System.out.println("Product Details " + (i + 1) + ": ");
			
			System.out.print("Product ID: " );
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Name: " );
			String name = sc.nextLine();
			
			System.out.print("Price: " );
			double price = sc.nextDouble();
			
			System.out.println("Quantity: ");
			int qty = sc.nextInt();
			
			sc.nextLine();
			
			Product p = new Product(id, name, price, qty);
			
			products.add(p);
			
			
		}
		
		
		  double totalInventoryValue = 0;

        System.out.println("\n--- Product Details ---");

        for (Product p : products) {
            p.displayProduct();
            totalInventoryValue += p.calculateTotalInventory();
        }

        System.out.println("Total Inventory Value = " + totalInventoryValue);
		
		
	}
}