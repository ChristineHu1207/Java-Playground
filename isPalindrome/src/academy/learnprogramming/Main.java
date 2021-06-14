package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println("The number is " +  isPalindrome(1222));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while(number != 0) {

            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;


//            System.out.println(lastDigit);
//            System.out.println(number);
//            System.out.println(reverse);
        }

        if(originalNumber == reverse) {
            return true;
        } else {
            return false;
        }

    }
}
