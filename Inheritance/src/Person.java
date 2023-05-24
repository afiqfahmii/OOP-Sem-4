public class Person extends Human {
    private String address;
    private String phoneNum;
    private String gender;

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public Person() {

    }

    public Person(String address) {
        this.address = address;
    }

    public Person(String address, String gender) {
        this(address);
        this.gender = gender;
    }

    public Person(String address, String pn, String gender) {
        // this.address = a;
        // this.gender = g;
        this(address, gender);
        this.phoneNum = pn;
    }

    public Person(String o, double h, int y, String address, String phoneNum, String gender) {
        super(o, h, y);
        this.address = address;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", phoneNum=" + phoneNum + ", gender=" + gender + ", Occupation="
                + occupation + ", height=" + height + ", yob=" + yob + "]";
    }

}
