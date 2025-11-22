package oops.inheritance;

// Dog.java
public class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat();    // inherited
        dog.sleep();  // inherited
        dog.bark();   // subclass method
    }
}
