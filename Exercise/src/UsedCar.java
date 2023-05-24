public class UsedCar {
    private String model;
    private double rateDepreciation;
    private double basicPrice;

    public UsedCar() {
        model = "";
        rateDepreciation = 0;
        basicPrice = 0.0;
    }

    public UsedCar(String n, Double rd, double bp) {
        this.model = n;
        this.rateDepreciation = rd;
        this.basicPrice = bp;
    }

    public String getModel() {
        return model;
    }

    public double getRateDepreciation() {
        return rateDepreciation;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public double calcDepreciationCost() {
        double cost = basicPrice * rateDepreciation;
        return cost;
    }
}
