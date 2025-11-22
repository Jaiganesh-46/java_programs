package oops.encapsulation;

// StudentMarks.java
public class StudentMarks {
    private final String name;
    private final int rollNo;
    private final double[] marks;

    // Constructor
    public StudentMarks(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Calculate average
    public double getAverage() {
        double sum = 0;
        for(double m : marks) sum += m;
        return sum / marks.length;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll: " + rollNo + ", Average: " + getAverage());
    }

    public static void main(String[] args) {
        double[] marks1 = {85, 90, 78};
        double[] marks2 = {92, 88, 95};

        StudentMarks s1 = new StudentMarks("Anika", 101, marks1);
        StudentMarks s2 = new StudentMarks("Rahul", 102, marks2);

        s1.display();
        s2.display();
    }
}
