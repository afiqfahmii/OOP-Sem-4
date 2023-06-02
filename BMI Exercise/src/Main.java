public class Main {

    public static void main(String[] args) {

        // BmiApp ba = new BmiApp();
        // ba.runApp();
        // System.exit(0);

        Address obj1 = new Address(233, "Jalan Kilang");
        Address obj2 = new Address(233, "Jalan Kilang");

        System.out.println("obj1 is : " + obj1.toString());
        System.out.println("obj2 is : " + obj2.toString());

        System.out.println("obj1 and obj2 same object ?" + (obj1 == obj2));

        System.out.println("obj1 and obj2 same object ?" + (obj1 == obj2));

        obj1 = obj2;
        System.out.println("After assignment , obj1 and obj2 same object?" + (obj1 == obj2));

    }
}
