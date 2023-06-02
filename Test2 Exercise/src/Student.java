public class Student {
    private String name;
    private String matricsNo;
    private double GPA;
    private static int totalCredit;

    public Student() {
        totalCredit = 0;
    }

    public double getGPA() {
        return GPA;
    }

    public String getMatricsNo() {
        return matricsNo;
    }

    public String getName() {
        return name;
    }

    public static int getTotalCredit() {
        return totalCredit;

    }

    public void setGPA(double gPA) {
        this.GPA = gPA;
    }

    public void setMatricsNo(String matricsNo) {
        this.matricsNo = matricsNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setTotalCredit(int totalCredit) {
        Student.totalCredit += totalCredit;
    }

}