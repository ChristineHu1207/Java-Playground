package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay) {
        if (isBarking == true && hourOfDay < 8 && hourOfDay >=0) {
            return true;
        } else if (isBarking == true && hourOfDay > 22 && hourOfDay < 24) {
            return true;
        } else {
            return false;
        }
    }
}
