package oops.encapsulation;

// EmployeeData.java
public class EmployeeData {
    private final String name;
    private final int id;
    private double salary;

    // Constructor overloading
    public EmployeeData(String name, int id) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if(id <= 0) {
            throw new IllegalArgumentException("ID must be positive");
        }
        this.name = name;
        this.id = id;
        this.salary = 0.0; // default
    }

    public EmployeeData(String name, int id, double salary) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if(id <= 0) {
            throw new IllegalArgumentException("ID must be positive");
        }
        if(salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Setter method
    public void setSalary(double salary) {
        if(salary >= 0) this.salary = salary;
        else System.out.println("Invalid salary");
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeeData emp1 = new EmployeeData("Anika", 101);
        emp1.setSalary(50000);

        EmployeeData emp2 = new EmployeeData("Rahul", 102, 75000);

        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("ID: " + emp1.getId());
        System.out.println("Salary: " + emp1.getSalary());
        
        System.out.println("\nEmployee 2 Details:");
        System.out.println("Name: " + emp2.getName());
        System.out.println("ID: " + emp2.getId());
        System.out.println("Salary: " + emp2.getSalary());
        
        System.out.println("\nUsing display method:");
        emp1.display();
        emp2.display();
    }
}
