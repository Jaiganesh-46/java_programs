public class StudentRecord {
    String name;
    int rollNo;
    double marks;

    void showData() {
        System.out.println(name + " (Roll No: " + rollNo + ") - Marks: " + marks);
    }

    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord();
        s1.name = "Anika";
        s1.rollNo = 101;
        s1.marks = 89.5;

        StudentRecord s2 = new StudentRecord();
        s2.name = "Rahul";
        s2.rollNo = 102;
        s2.marks = 94.0;

        StudentRecord s3 = new StudentRecord();
        s3.name = "Kiran";
        s3.rollNo = 103;
        s3.marks = 76.2;

        s1.showData();
        s2.showData();
        s3.showData();
    }
}
