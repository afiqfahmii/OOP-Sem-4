public class Invoice {

    public String partDesc;
    public double price;

    public Invoice(String pD, int q, double p) {
        this.partDesc = pD;
        this.price = p;
    }

    public Invoice(String pD, double p) {
        this.partDesc = pD;
        this.price = p;
    }

    public String getDesc() {
        return partDesc;
    }

    public double getPrice() {
        return price;
    }

}
