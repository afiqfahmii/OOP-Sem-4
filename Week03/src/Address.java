public class Address {
    
    private int houseNumber;
    private String streetAddress;


public Address(int hn, String sa) {
    this.houseNumber = hn;
    this.streetAddress = sa;
    
}

public Address(){

}

public void setHouseNumber(int homeNumber) {
    this.houseNumber = homeNumber;
}

public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
}

public int getHouseNumber() {
    return houseNumber;
}

public String getStreetAddress() {
    return streetAddress;
}



@Override

public String toString() {
    return "Course{" + " House Number" + getHouseNumber() + ", Street Address" + getHouseNumber() + "}";
}
}