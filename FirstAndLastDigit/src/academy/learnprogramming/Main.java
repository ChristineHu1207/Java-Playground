package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-12));
        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumFirstAndLastDigit(133335));
    }

    public static int sumFirstAndLastDigit (int number) {

        if(number < 0) {
            return -1;
        }

        int lastDigit;
        int firstDigit = 0;
        int sum = 0;


        lastDigit = number % 10;

        while(number > 0) {
            int digit = number % 10;
            number /= 10;
            firstDigit = digit;
        }

        sum = firstDigit + lastDigit;

        return sum;
    }
}
