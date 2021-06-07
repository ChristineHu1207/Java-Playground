package academy.learnprogramming;

import javax.sound.midi.Soundbank;
import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;

	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
	System.out.println("Integer Minimum Value = " + myMinIntValue);
	System.out.println("Integer Maximum Value = " + myMaxIntValue);
	System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); //overflow
    System.out.println("Busted MIN value =" + (myMinIntValue -1)); //underflow

    int myMaxIntTest = 2_147_483_647; //也能识别 更容易阅读 (only java 7 and higher)

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue);
    System.out.println("Byte Maximum Value = " + myMaxByteValue);
    //用Byte是因为Smaller data type takes up less space; 而且能知道这个data range 很小


    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value = " + myMinShortValue);
    System.out.println("Short Maximum Value = " + myMaxShortValue);

        // Byte occupies 8 bits
        // short occupies 16 bits
        // int occupies 32 bits
        // long occupies 64 bits

        long myLongValue = 100L; //force java to treat this number as long type
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteraValue = 2_147_483_647-234; // still treat as integer
        long bigLongLiteraValue = 2_147_483_647_234L; //treat as long
    


    }
}
