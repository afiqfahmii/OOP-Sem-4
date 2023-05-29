public class Cylinder extends ThreeD {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2) * height;
        System.out.println(area);
    }

    @Override
    public void calculateVolume() {
        volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println(volume);
    }
}
