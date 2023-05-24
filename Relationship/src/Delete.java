public class Delete {

    public void deleteCourse(Student s, Course c) {
        s.deleteCourse(c);
        c.deleteStud(s);
    }
    
}
