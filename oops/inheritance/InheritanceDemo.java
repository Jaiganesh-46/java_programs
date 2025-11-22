package oops.inheritance;

// Inheritance Example in Java
// Save this file as InheritanceDemo.java
// Run: javac InheritanceDemo.java && java InheritanceDemo

// Base class (Parent)
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    public void start() {
        System.out.println(brand + " is starting...");
    }
}

// Derived class (Child)
class Car extends Vehicle {
    int doors;

    // Using super to call parent constructor
    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    // Child specific method
    public void openDoors() {
        System.out.println("Opening " + doors + " doors...");
    }
}

// Another derived class
class Bike extends Vehicle {
    boolean hasHelmet;

    Bike(String brand, int speed, boolean hasHelmet) {
        super(brand, speed);
        this.hasHelmet = hasHelmet;
    }

    public void safetyCheck() {
        if (hasHelmet) {
            System.out.println("Helmet check — ready to ride.");
        } else {
            System.out.println("Helmet missing — unsafe ride!");
        }
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Car Object ===");
        Car c1 = new Car("Tesla", 180, 4);
        c1.displayInfo();  // Inherited from Vehicle
        c1.start();        // Inherited from Vehicle
        c1.openDoors();    // Specific to Car

        System.out.println("\n=== Bike Object ===");
        Bike b1 = new Bike("Yamaha", 120, true);
        b1.displayInfo();
        b1.start();
        b1.safetyCheck();
    }
}
