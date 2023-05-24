public class Student {

    private String name;
    private float age;
    private String matricNumber;
    private Course cList[] = new Course[30];
    private int courseNum;

    public Student() {
        cList = new Course[30];
    }

    public void StudRegCourse(Course c) {
        cList[courseNum] = c;
        courseNum++;
    }

    public Student(String name, float age, String matricNumber) {
        this.name = name;
        this.age = age;
        this.matricNumber = matricNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    @Override

    public String toString() {
        return "Course{" + "name=" + name + ", age=" + age + ", MatricNumber =" + matricNumber + "}";
    }
}
