import java.util.ArrayList;

public class Course {
    private String code;
    ArrayList<Student> studList = new ArrayList<>();
    private int numStud;

    public Course() {

    }

    public Course(String c) {
        this.code = c;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void addStudent(Student s) {
        if (numStud < 30) {
            studList.add(s);
            System.out.println("Student has been added");
        } else {
            System.out.println("Already Full");
        }
    }

    public void deleteStud(Student s) {
        if (studList.contains(s)) {
            studList.remove(s);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found in the course.");
        }
    }
}
