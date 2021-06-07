package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	byte myByteValue = 2;
	short myShortValue = 4;
	int myIntValue = 50;

	long longTotal = 50000L + 10L * (myByteValue + myShortValue + myIntValue); // no need for casting, int always fit in long
		System.out.println(longTotal);
	short shortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue)); // need casting
		System.out.println(shortTotal);

    }
}
