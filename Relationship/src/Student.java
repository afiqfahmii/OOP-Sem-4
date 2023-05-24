import java.util.ArrayList;

public class Student {

    private String name;
    private int numSub;
    // Course courselist[] = new Course[6];
    ArrayList<Course> courselist = new ArrayList<>();

    public Student() {

    }

    public Student(String n) {
        this.name = n;
    }

    public void regCourse(Course c) {
        // Implementation
        if (numSub < 6) {
            courselist.add(c);
            numSub++;
            System.out.println("Course Has Been Registered");
        } else {
            System.out.println("Already Full");
        }
    }

    public void deleteCourse(Course c) {
        if (courselist.contains(c)) {
            courselist.remove(c);
            numSub--;
            System.out.println("Course deleted successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}