package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("**********************************");

        count = 1;
        while(true) {
            if(count == 6) {
                break;
            } // while(true) ---> infinite loop
            System.out.println("Count value is " + count);
            count ++;
        }

        System.out.println("**********************************");

        for (int i=1; i<6; i++) {
            System.out.println("Count value is " + i);
        }

        System.out.println("**********************************");

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6); // do while is always going to be executed at least once

        System.out.println("**********************************");

        count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;

            if(count >100) {
                break;
            }
        } while (count != 6);
    }
}
