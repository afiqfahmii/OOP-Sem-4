public class Student {

    private String name;
    private String matricNum;
    private int age;
    double[] cm=new double[5];

    public Student() {

    }

    public Student(String n, String man, int a) {
        this.name = n;
        this.matricNum = man;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public String getMatricNum() {
        return matricNum;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setMatricNum(String mn) {
        this.matricNum = mn;
    }

    public void setAge(int a) {
        this.age = a;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", age=" + age + ", MatricNumber =" + matricNum + "}";
    }
}
