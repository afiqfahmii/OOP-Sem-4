import java.util.Objects;

public class Address {

    private int houseNumber;
    private String streetAddress;

    public Address(int hn, String sa) {
        this.houseNumber = hn;
        this.streetAddress = sa;

    }

    public Address() {

    }

    public void setHouseNumber(int hn) {
        this.houseNumber = hn;
    }

    public void setStreetAddress(String sa) {
        this.streetAddress = sa;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    @Override

    public String toString() {
        return "Course{" + " House Number : " + this.houseNumber + ", Street Address : " + this.streetAddress + "}";
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (this.houseNumber != other.houseNumber) {
            return false;
        }
        if (!Objects.equals(this.streetAddress, other.streetAddress)) {
            return false;
        }
        return true;
    }
}