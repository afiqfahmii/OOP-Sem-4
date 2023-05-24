public class Student extends Human {

    private String matricNum;
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getMatricNum() {
        return matricNum;
    }

    public String getName() {
        return name;
    }

    public Student(String n, String mn, int a) {
        this.name = n;
        this.matricNum = mn;
        this.age = a;
    }

    public Student(String o, double h, int y, String matricNum, int age, String name) {
        super(o, h, y);
        this.matricNum = matricNum;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [Matric Number=" + matricNum + ", Age=" + age + ", Name=" + name + ", Occupation=" + occupation
                + ", Height=" + height + ", Year Of Birth=" + yob + "]";
    }

}
