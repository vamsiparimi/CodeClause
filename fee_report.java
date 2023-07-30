import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int id;
    private double fee;

    public Student(String name, int id, double fee) {
        this.name = name;
        this.id = id;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getFee() {
        return fee;
    }

    public static void put(String string) {
    }

    public static void put(String string, int i) {
    }
}

class FeeReport {
    private List<Student> students;

    public FeeReport() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void generateReport() {
        System.out.println("Fee Report");
        System.out.println("-------------------");
        System.out.println("Name\tID\tFee");
        System.out.println("-------------------");

        for (Student student : students) {
            System.out.println(student.getName() + "\t" + student.getId() + "\t" + student.getFee());
        }

        System.out.println("-------------------");
    }
}

public class fee_report {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Chris", 1, 10500.0);
        Student student2 = new Student("John", 2, 15300.0);
        Student student3 = new Student("Raj", 3, 11200.0);

        // Create fee report
        FeeReport feeReport = new FeeReport();

        // Add students to the report
        feeReport.addStudent(student1);
        feeReport.addStudent(student2);
        feeReport.addStudent(student3);

        // Generate and print the report
        feeReport.generateReport();
    }
}
