package oops.polymorphism;

// Polymorphism Example in Java
// Save as PolymorphismDemo.java
// Run: javac PolymorphismDemo.java && java PolymorphismDemo

// Base class
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

// Class showing method overloading (compile-time polymorphism)
class SoundPlayer {
    // No argument
    public void playSound() {
        System.out.println("Playing default sound...");
    }

    // One argument
    public void playSound(String soundName) {
        System.out.println("Playing sound: " + soundName);
    }

    // Two arguments
    public void playSound(String soundName, int repeatCount) {
        for (int i = 1; i <= repeatCount; i++) {
            System.out.println("Playing sound: " + soundName + " (" + i + ")");
        }
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=== Runtime Polymorphism (Overriding) ===");
        Animal a1 = new Dog();  // upcasting
        Animal a2 = new Cat();

        a1.makeSound(); // calls Dog version
        a2.makeSound(); // calls Cat version

        System.out.println("\n=== Compile-time Polymorphism (Overloading) ===");
        SoundPlayer sp = new SoundPlayer();
        sp.playSound();                   // no arguments
        sp.playSound("Thunder");          // one argument
        sp.playSound("Rain Drops", 3);    // two arguments
    }
}
