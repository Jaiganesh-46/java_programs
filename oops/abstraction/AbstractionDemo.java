package oops.abstraction;

// Abstraction Example in Java
// Save this file as AbstractionDemo.java
// Run: javac AbstractionDemo.java && java AbstractionDemo

// Abstract class — defines a template or blueprint
abstract class Vehicle {
    // Abstract method — no implementation (must be overridden)
    abstract void start();

    // Concrete (normal) method — can be used by all subclasses
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Subclass 1 implementing abstract method
 class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine started with key ignition.");
    }
}

// Subclass 2 implementing abstract method
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike engine started with self-start button.");
    }
}

// Subclass 3 implementing abstract method
class ElectricScooter extends Vehicle {
    @Override
    void start() {
        System.out.println("Electric scooter started silently.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstraction Example ===");

        // Cannot instantiate abstract class directly
        // Vehicle v = new Vehicle(); ❌

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new ElectricScooter();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();

        v3.start();
        v3.stop();
    }
}
