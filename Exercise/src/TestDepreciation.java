// AFIQ FAHMI BIN ROSLAN
// A21EC0153


public class TestDepreciation {
    public static void displayInfo (UsedCar obj )
{
System.out.println("\n\nModel: " + obj.getModel() + "\nRate of depreciation: "
+ obj.getRateDepreciation() + "\nnPurchase Price: " + obj.getBasicPrice() + "\nTotal depreciation: " + obj.calcDepreciationCost());
}

    public static void main(String[] args) {
        UsedCar car1 = new UsedCar("Toyota", 0.35, 75000.0);
        UsedCar car2 = new UsedCar("Kia", 0.5, 10000.0);

        displayInfo(car2);
        displayInfo(car1);
        
    }

}
