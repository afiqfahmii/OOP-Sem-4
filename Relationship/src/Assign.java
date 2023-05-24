public class Assign {

    public void addCourse(Student s, Course c) {
        s.regCourse(c);
        c.addStudent(s);
    }

}
