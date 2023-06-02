public class Address {
    public String street;
    public String city;
    public int poscode;
    public String state;

    public Address(String street, String city, int poscode, String state) {
        this.street = street;
        this.city = city;
        this.poscode = poscode;
        this.state = state;
    }

    public String getAddress() {
        return street + " " + city + " " + poscode + " " + state;
    }

}
