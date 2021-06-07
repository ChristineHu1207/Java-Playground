package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    char charVariable = 'L';

	    switch (charVariable) {
	        case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D': case 'E':
                System.out.println(charVariable + " was found");
                break;
            default:
                System.out.println("Not found");
                break;

        }

        String month = "JANuary";
	    switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
