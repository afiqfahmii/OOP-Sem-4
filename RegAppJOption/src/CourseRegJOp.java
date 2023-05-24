import javax.swing.JOptionPane;

public class CourseRegJOp {
    public static void main(String[] args) throws Exception {

        // Display a message dialog box
        JOptionPane.showMessageDialog(null, "Welcome to the Course Registration App!");

        // Course
        Course oops6;
        oops6 = new Course();
        oops6.setCourseName("Object Oriented Prog Using Java");
        oops6.setCourseCode("SECJ 3033");
        oops6.setCredits(4);

        // Display an input dialog box and store the result in a variable
        String lecturerName = JOptionPane.showInputDialog(null, "Enter the name of the lecturer:");
        String lecturerSpecialization = JOptionPane.showInputDialog(null, "Enter the specialization of the lecturer:");
        String lecturerID = JOptionPane.showInputDialog(null, "Enter the ID of the lecturer:");

        // Lecturer
        Lecturer lect1 = new Lecturer(lecturerName, lecturerSpecialization, lecturerID);

        // Display an input dialog box and store the result in a variable
        String studentName = JOptionPane.showInputDialog(null, "Enter the name of the student:");
        int studentAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the age of the student:"));
        String studentID = JOptionPane.showInputDialog(null, "Enter the ID of the student:");

        // Student
        Student s1 = new Student(studentName, studentAge, studentID);

        // Display a message dialog box
        JOptionPane.showMessageDialog(null, "You have registered " + s1.getName() + " for the course " + oops6.getCourseName());

        // Add student to course and print list of students
        oops6.addStudent(s1);
        s1.StudRegCourse(oops6);
        oops6.printStudent();

        // Display a message dialog box
        JOptionPane.showMessageDialog(null, "Thank you for using the Course Registration App!");
    }
}