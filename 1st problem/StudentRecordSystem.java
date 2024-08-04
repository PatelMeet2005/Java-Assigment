public class StudentRecordSystem {
    private Student[] students;
    private int count;

    // Constructor
    public StudentRecordSystem(int capacity) {
        students = new Student[capacity];
        count = 0;
    }

    // Method to add a student
    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Cannot add more students, system is full.");
        }
    }

    // Method to get a student by ID
    public Student getStudent(int studentID) {
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentID() == studentID) {
                return students[i];
            }
        }
        return null;
    }

    // Method to display all students
    public void displayAllStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }
}
