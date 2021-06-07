package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	double firstDoubleValue = 20;
	double secondDoubleValue = 80;
	double result = (firstDoubleValue + secondDoubleValue) * 100;

	double resultRemainder = result % 40;
	boolean remainderIsZero = (resultRemainder == 0) ? true : false;
		System.out.println("boolean result is " + remainderIsZero);

	if (remainderIsZero == false) {
		System.out.println("Got some remainder");
	}


    }
}
