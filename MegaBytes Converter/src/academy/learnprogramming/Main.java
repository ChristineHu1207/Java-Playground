package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(3000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        int megaBytes = (int)(kiloBytes / 1024);
        int remainingKiloBytes = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
