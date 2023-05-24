import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Double> temp = new ArrayList<>();

        temp.add(12.5);
        temp.add(13.5);
        temp.add(14.5);
        temp.add(15.5);
        temp.add(16.5);

        temp.add(17.5);
        temp.add(18.5);
        temp.add(19.5);
        temp.add(20.5);
        temp.add(21.5);

        temp.add(22.5);
        temp.add(12.5);
        temp.add(12.5);
        temp.add(12.5);
        temp.add(12.5);

        double highest1 = temp.get(0);
        double lowest1 = temp.get(0);
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) > highest1) {
                highest1 = temp.get(i);
            }
            if (temp.get(i) < lowest1) {
                lowest1 = temp.get(i);
            }

        }
        System.out.println("Highest Temperature :" + highest1);
        System.out.println("Lowest Temperature :" + lowest1);

        double total = 0;
        for (int i = 0; i < temp.size(); i++) {
            total += temp.get(i);
        }
        Double average1 = (total / 15);

        System.out.println("Average Temperature: " + average1);

        ArrayList<TempRecord> alist = new ArrayList<>();

        alist.add(new TempRecord("kangar", 38.7, "Hot"));
        alist.add(new TempRecord("ipoh", 2.7, "Windy"));
        alist.add(new TempRecord("johor bahru", 9.7, "Snow"));
        alist.add(new TempRecord("meru", 17.7, "Heavy Rain"));
        alist.add(new TempRecord("cheras", 30.7, "Hot"));

        alist.add(new TempRecord("kodiang", 29.5, "Sunny"));
        alist.add(new TempRecord("malacca", 25.3, "Cloudy"));
        alist.add(new TempRecord("kota kinabalu", 32.1, "Humid"));
        alist.add(new TempRecord("kuching", 27.8, "Thunderstorms"));
        alist.add(new TempRecord("langkawi", 31.2, "Scattered showers"));

        alist.add(new TempRecord("genting highlands", 20.5, "Foggy"));
        alist.add(new TempRecord("bukit tinggi", 18.2, "Misty"));
        alist.add(new TempRecord("cameron highlands", 22.6, "Cool"));
        alist.add(new TempRecord("georgetown", 28.9, "Partly cloudy"));
        alist.add(new TempRecord("kuala terengganu", 26.4, "Breezy"));

        TempRecord highest = alist.get(0);
        TempRecord lowest = alist.get(0);
        Double average = 0.0;

        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getTemperature() > highest.getTemperature()) {
                highest = alist.get(i);
            }
            if (alist.get(i).getTemperature() < lowest.getTemperature()) {
                lowest = alist.get(i);
            }
            average += alist.get(i).getTemperature();
        }

        Double AverageList = (average / alist.size());

        System.out.println();
        System.out.println("Highest Temperature Info : " + highest.toString());
        System.out.println("Lowest Temperature Info : " + lowest.toString());
        System.out.println("Average Temperature : " + AverageList);

        // -------------------------------------------------------------------------------------------------------------------------

    }
}
