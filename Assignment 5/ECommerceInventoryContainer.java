import java.util.*;

class Electronics{
	String name;
	double price;
	
	public Electronics(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	void display(){
		System.out.println("Electronics: " + name + ", Price: " + price);
	}
}

class Clothing{
	String brand;
	String size;
	
	public Clothing(String brand, String size){
		this.brand = brand;
		this.size = size;
	}
	
	void display(){
		System.out.println("Clothing: " + brand + ", Size: " + size);
	}
}


class Inventory<T>{
	private T product;
	
	public void addProduct(T product){
		this.product = product;
	}
	
	public T getProduct(){
		return product;
	}
}


public class ECommerceInventoryContainer{
	public static void main(String args[]){
		
		Inventory<Electronics> electronicsInventory = new Inventory<>();
		Electronics e1 = new Electronics("Laptop", 75000);
		electronicsInventory.addProduct(e1);
		
		Electronics retrievedE = electronicsInventory.getProduct();
		retrievedE.display();
		
		System.out.println();
		
		Inventory<Clothing> clothingInventory = new Inventory<>();
		Clothing c1 = new Clothing("Cottonking", "Large");
		clothingInventory.addProduct(c1);
		
		Clothing retrievedC = clothingInventory.getProduct();
		retrievedC.display();
		
		System.out.println();
		
	}
}