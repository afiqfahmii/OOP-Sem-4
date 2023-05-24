import java.util.Scanner;

public class BmiApp {

    public BmiApp() {
    }

    Person p = new Person();
    Address addr = new Address();

    public void runApp() {
        readInfo();
        p.calcBmi();
        displayInfo();
    }

    private void readInfo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Name : ");
        String name = s.nextLine();
        System.out.println("Please Enter Street Address");
        String streetAddress = s.nextLine();
        System.out.println("Please Enter YOB : ");
        int yob = s.nextInt();
        System.out.println("Please Enter Weight :(kg)");
        float berat = s.nextFloat();
        System.out.println("Please Enter Height :(Meter)");
        float tinggi = s.nextFloat();
        System.out.println("Please Enter House Number");
        int houseNumber = s.nextInt();

        Address addr = new Address(houseNumber, streetAddress);
        Person p = new Person(name, yob, berat, tinggi, addr);

    }

    private void displayInfo() {
        System.out.println(p.toString());

    }

}
