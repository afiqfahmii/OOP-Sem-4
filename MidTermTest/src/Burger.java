public class Burger {
    private int SIZE = 15;
    private String code;
    private int quantity;
    private int totalItem;

    public Burger(String c, int q) {
        this.code = c;
        this.quantity = q;
    }

    public int getTotalItem() {
        return totalItem;
    }

    public String getCode() {
        return code;
    }

    public int getQuantity() {
        return quantity;
    }

    

    
}
