public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Ali");
        Student s2 = new Student("Omar");

        Course c1 = new Course("SECJ3303");
        Course c2 = new Course("SECR4444");
        Course c3 = new Course("SECP2222");
        Course c4 = new Course("SECJ3303");
        Course c5 = new Course("SECJ3303");
        Course c6 = new Course("SECJ3303");

        // s1.regCourse(c1);
        // s1.regCourse(c2);
        // s1.regCourse(c3);
        // s1.regCourse(c4);
        // s1.regCourse(c5);
        // s1.regCourse(c6);

        // c1.addStudent(s1);
        // c3.addStudent(s2);
        // c6.addStudent(s1);

        Assign s = new Assign();
        s.addCourse(s1, c1);
        s.addCourse(s2, c6);
        s.addCourse(s2, c3);
        System.out.println();

        Delete d = new Delete();
        d.deleteCourse(s2, c6);
        System.out.println();
    
    }
}
