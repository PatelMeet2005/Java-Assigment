import java.util.Scanner;

public class StudentRecordMGMT {
    public static void main(String[] args) {
        StudentRecordSystem system = new StudentRecordSystem(100); // Initialize system with capacity of 100 students
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View Student by ID");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter student department: ");
                    String department = scanner.nextLine();

                    Student student = new Student(id, name, age, department);
                    system.addStudent(student);
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    int searchID = scanner.nextInt();
                    Student foundStudent = system.getStudent(searchID);
                    if (foundStudent != null) {
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    system.displayAllStudents();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
