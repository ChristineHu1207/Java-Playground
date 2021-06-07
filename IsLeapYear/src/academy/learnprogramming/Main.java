package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYEar(-1));
        System.out.println(isLeapYEar(2020));
        System.out.println(isLeapYEar(2021));
    }

    public static boolean isLeapYEar (int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
