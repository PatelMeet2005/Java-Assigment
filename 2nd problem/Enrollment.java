public class Enrollment {
    private int[][] studentCourses;
    private int[] count;

    public Enrollment(int numStudents, int numCourses) {
        studentCourses = new int[numStudents][numCourses];
        count = new int[numStudents];
    }

    public void enroll(int studentID, int courseID) {
        if (count[studentID] < studentCourses[studentID].length) {
            studentCourses[studentID][count[studentID]] = courseID;
            count[studentID]++;
        } else {
            System.out.println("Cannot enroll: Maximum courses reached for student " + studentID);
        }
    }

    public void drop(int studentID, int courseID) {
        if (count[studentID] == 0) {
            System.out.println("Alert: Student " + studentID + " is not enrolled in any courses.");
            return;
        }
    
        boolean found = false;
        for (int i = 0; i < count[studentID]; i++) {
            if (studentCourses[studentID][i] == courseID) {
                found = true;
                for (int j = i; j < count[studentID] - 1; j++) {
                    studentCourses[studentID][j] = studentCourses[studentID][j + 1];
                }
                studentCourses[studentID][count[studentID] - 1] = 0;
                count[studentID]--;
                break;
            }
        }
        if (!found) {
            System.out.println("Course ID " + courseID + " not found for student " + studentID);
        }
    }
    

    public void getEnrolledCourses(int studentID, Course[] courseCatalog) {
        if (count[studentID] == 0) {
            System.out.println("Student " + studentID + " is not enrolled in any courses.");
            return;
        }

        System.out.println("Student " + studentID + " is enrolled in:");
        for (int i = 0; i < count[studentID]; i++) {
            int courseID = studentCourses[studentID][i];
            for (Course course : courseCatalog) {
                if (course.getCourseID() == courseID) {
                    System.out.println(course);
                    break;
                }
            }
        }
    }
}
