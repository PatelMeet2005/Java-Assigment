import java.util.Scanner;

public class CourseEnrollment {
    private Course[] courseCatalog;
    private Enrollment enrollment;

    public CourseEnrollment(Course[] courseCatalog, Enrollment enrollment) {
        this.courseCatalog = courseCatalog;
        this.enrollment = enrollment;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample courses
        Course[] courses = {
            new Course(1, "Mathematics", 3),
            new Course(2, "Physics", 4),
            new Course(3, "Chemistry", 4)
        };

        // Create enrollment system for 5 students and 10 courses
        Enrollment enrollment = new Enrollment(5, 10);
        CourseEnrollment courseEnrollment = new CourseEnrollment(courses, enrollment);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Enroll in a course");
            System.out.println("2. Drop a course");
            System.out.println("3. View enrolled courses");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int studentID = scanner.nextInt();
                    System.out.println("1 for Mathemetics");
                    System.out.println("2 for Physics");
                    System.out.println("1 for Chemistry");
                    System.out.print("Enter course ID: ");
                    int courseID = scanner.nextInt();
                    enrollment.enroll(studentID, courseID);
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextInt();
                    System.out.print("Enter course ID: ");
                    courseID = scanner.nextInt();
                    enrollment.drop(studentID, courseID);
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextInt();
                    enrollment.getEnrolledCourses(studentID, courses);
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
