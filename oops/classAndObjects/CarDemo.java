package oops.classAndObjects;
class CarDemo {
    String brand;
    String model;
    double price;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        CarDemo car1 = new CarDemo();
        car1.brand = "Tesla";
        car1.model = "Model 3";
        car1.price = 3500000;

        CarDemo car2 = new CarDemo();
        car2.brand = "Tata";
        car2.model = "Nexon EV";
        car2.price = 1800000;

        car1.displayInfo();
        car2.displayInfo();
    }
}
