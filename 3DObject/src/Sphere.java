public class Sphere extends ThreeD {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void calculateVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
