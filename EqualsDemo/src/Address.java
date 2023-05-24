public class Address {
    private String address;
    private int homeNumber;

    // CREATE CONSTRUCTOR
    public Address(String a, int hn) {
        this.address = a;
        this.homeNumber = hn;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setHomeNumber(int hn) {
        this.homeNumber = hn;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    @Override
    public String toString() {
        return "Address :"+ address + "," + "Home Number :"+ homeNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
    }

}
