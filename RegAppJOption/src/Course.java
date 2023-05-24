public class Course {

    private String courseName;
    private String courseCode;
    private int credits;
    private Student sList[] = new Student[30];
    private int studNum;
    final int MAX = 30;

    public void addStudent(Student s) {

        if (studNum < MAX) {
            sList[studNum] = s;
            studNum++;
        } else {
            System.out.println("Full");
        }

    }

    public void printStudent() {
        for (int i = 0; i < 30; i++) {
            if (sList[i] != null) {
                System.out.println(sList[i].getName());
            } else {
                break;
            }
        }
    }

    public Course() {
        sList = new Student[30];
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Course(String courseName, String courseCode, int credits) {
        // course num 0
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + courseName + ", code=" + courseCode + ", credits=" + credits + "}";
    }

}
