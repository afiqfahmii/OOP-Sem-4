public class Lecturer {

    private String name;
    private String department;
    private String staffId;

    public Lecturer() {

    }

    public Lecturer(String name, String department, String staffId) {

        this.name = name;
        this.department = department;
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override

    public String toString() {
        return "Course{" + "name=" + name + ", department=" + department + ", staffId=" + 222 + "}";
    }
}
