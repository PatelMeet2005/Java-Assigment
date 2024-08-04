public class Student {
    private int studentID;
    private String name;
    private int age;
    private String department;

    // Constructor
    public Student(int studentID, String name, int age, String department) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter methods
    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + name + ", Age: " + age + ", Department: " + department;
    }
}
