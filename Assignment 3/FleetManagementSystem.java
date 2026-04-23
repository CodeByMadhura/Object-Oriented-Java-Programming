import java.util.Scanner;

class Vehicle {

    protected String brand;
    protected int speed;

    static {
        System.out.println("Fleet Management System");
    }

    {
        System.out.println("Vehicle object is being created..");
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void updateSpeed(int newSpeed) {
        this.speed = newSpeed;
        System.out.println("Speed Updated Successfully!");
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    private String fuelType;

    public Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    public void display() {
        super.display();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Bike extends Vehicle {
    private double mileage;

    public Bike(String brand, int speed, double mileage) {
        super(brand, speed);
        this.mileage = mileage;
    }

    public void display() {
        super.display();
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

public class FleetManagementSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vehicles: ");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        // INPUT
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter vehicle type (1-Car, 2-Bike): ");
            int type = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter Speed: ");
            int speed = sc.nextInt();

            if (type == 1) {
                sc.nextLine();
                System.out.print("Enter Fuel Type: ");
                String fuel = sc.nextLine();

                vehicles[i] = new Car(brand, speed, fuel);

            } else if (type == 2) {
                System.out.print("Enter Mileage: ");
                double mileage = sc.nextDouble();

                vehicles[i] = new Bike(brand, speed, mileage);
            }
        }

    
        System.out.println("\n=== Vehicle Details ===");
        for (int i = 0; i < n; i++) {
            vehicles[i].display();
            System.out.println("----------------------");
        }

    
        System.out.println("\nEnter index of vehicle to update speed: ");
        int index = sc.nextInt();

        if (index >= 0 && index < n) {
            System.out.print("Enter new speed: ");
            int newSpeed = sc.nextInt();

            vehicles[index].updateSpeed(newSpeed);
        } else {
            System.out.println("Invalid index!");
        }

      
        System.out.println("\n=== Updated Vehicle Details ===");
        for (int i = 0; i < n; i++) {
            vehicles[i].display();
            System.out.println("----------------------");
        }

        sc.close();
    }
}