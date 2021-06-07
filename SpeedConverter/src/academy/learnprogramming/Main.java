package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        long miles = toMilesPerHour(1.5);
        System.out.println(miles);

        printConversion(1.5);
    }

    public static long toMilesPerHour (double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        } else {
            double convertedMiles = kilometerPerHour * (1 / 1.609);
            long roundMiles = Math.round(convertedMiles);
            return roundMiles;

        }
    }

    public static void printConversion (double kilometerPerHour) {

        if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
