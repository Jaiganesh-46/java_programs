package oops.encapsulation;

public class LaptopSpecs {
    private final String brand;
    private String cpu;
    private int ram; // in GB

    // Constructor
    public LaptopSpecs(String brand, String cpu, int ram) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
    }

    // Getter & Setter
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if(ram > 0) this.ram = ram;
        else System.out.println("Invalid RAM size");
    }

    public void displaySpecs() {
        System.out.println("Brand: " + brand + ", CPU: " + cpu + ", RAM: " + ram + "GB");
    }

    public static void main(String[] args) {
        LaptopSpecs lap = new LaptopSpecs("Dell", "i5", 8);
        lap.displaySpecs();
        lap.setRam(16);
        lap.setCpu("i7");
        lap.displaySpecs();
    }
}
