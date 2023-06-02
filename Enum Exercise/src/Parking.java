import java.util.Scanner;

public class Parking {

    enum Car {
        MOTORCYCLE(1), SEDAN_CAR(2), MPV_CAR(3), VAN(3);

        double hourRate;

        Car(double hr) {
            this.hourRate = hr;
        }

        public double getHourRate() {
            return hourRate;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please select the type of vehicle:");
        for (int i = 0; i < Car.values().length; i++) {
            Car c1 = Car.values()[i];
            System.out.println(i + 1 + ". " + c1.name());
        }

        System.out.println("Enter The Choice:_");
        int selection = s.nextInt();
        Car c1 = Car.values()[selection - 1];

        System.out.println("Enter Parking Hours:_");
        double hoursParked = s.nextDouble();

       
        double fee = hoursParked * c1.getHourRate();;

        System.out.println("Fee is RM: " + fee);
    }
}