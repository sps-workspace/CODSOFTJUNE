import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

        // Add students
        studentManagementSystem.addStudent(new Student("John Doe", 1, "A"));
        studentManagementSystem.addStudent(new Student("Jane Doe", 2, "B"));

        // Search for a student
        Student student = studentManagementSystem.searchStudent(1);
        System.out.println("Student found: " + student.getName());

        // Display all students
        studentManagementSystem.displayAllStudents();
    }
}
 class StudentManagementSystem {

    private List<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student.getName() + ", " + student.getRollNumber() + ", " + student.getGrade());
        }
    }
}

 class Student {

    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}