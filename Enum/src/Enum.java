public class Enum {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day workday1 = Day.THURSDAY;
        Day workday2 = Day.THURSDAY;

        System.out.println("Today is " + workday1);
        System.out.println("Yesterday was " + Day.WEDNESDAY);


        // equals() method to compare two enum constants
        boolean Equal = workday1.equals(workday2);
        if (Equal) {
            System.out.println(workday1 + " and " + workday2 + " are the same day");
        } else {
            System.out.println(workday1 + " and " + workday2 + " are not the same day");
        }

        // Get the ordinal value of the workday == check for value of enum constant
        int ordinal = workday1.ordinal();
        System.out.println("Ordinal value of " + workday1 + " is " + ordinal);

        // Compare enum constants == same with like ordinal method 
        int compare = workday1.compareTo(workday2);
        if(compare < 0){
            System.out.println("Is Before");
        } else if(compare == 0){
            System.out.println("Same Day");
        } else{
            System.out.println("Is After");
        }
    }
}