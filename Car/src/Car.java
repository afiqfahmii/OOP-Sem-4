public class Car {

    private Chassis chassis;
    private Engine engine;
    private Wheel[] wheels;

    private String brand;
    private String modelName;

    public Car(Chassis chassis, Engine engine, Wheel[] wheels) {
        this.chassis = chassis;
        this.engine = engine;
        this.wheels = wheels;
    }

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public Car() {
    }

    public String getModelName() {
        return modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }
}
