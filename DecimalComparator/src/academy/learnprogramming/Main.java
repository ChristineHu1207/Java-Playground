package academy.learnprogramming;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));

/*        double firstNumber = -3.1756;
        double secondNumber = -3.175;
        DecimalFormat df = new DecimalFormat ("#.###");
        df.setRoundingMode(RoundingMode.DOWN);
        String s1 = df.format(firstNumber);
        String s2 = df.format(secondNumber);
        System.out.println(s1);
        System.out.println(s2);*/
    }

    /*public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        DecimalFormat df = new DecimalFormat ("#.###");
        df.setRoundingMode(RoundingMode.DOWN);
        String s1 = df.format(firstNumber);
        String s2 = df.format(secondNumber);

        if(s1.equals(s2)) {
            return true;
        }else {
            return false;
        }
    }*/

    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        int n1 = (int)(firstNumber * 1000);
        int n2 = (int)(secondNumber * 1000);

        if(n1 - n2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
