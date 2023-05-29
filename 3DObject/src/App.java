public class App {
    public static void main(String[] args) throws Exception {

        Sphere s1 = new Sphere(3.0);
        s1.calculateVolume();

        Cylinder c1 = new Cylinder(3.0,4);
        c1.calculateVolume();
    }
}
