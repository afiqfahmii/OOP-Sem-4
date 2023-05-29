
public abstract class ThreeD {
    protected double surfaceArea;
    protected double volume;
    protected double radius;
    protected double height;

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public abstract void calculateArea();

    public abstract void calculateVolume();

}
