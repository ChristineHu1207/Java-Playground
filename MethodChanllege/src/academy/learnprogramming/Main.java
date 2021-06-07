package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Christine",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Yinhao",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Beibei", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Jie", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Kim", highScorePosition);
    }

    public static void displayHighScorePosition (String name, int position) {

        System.out.println( name + " managed tp get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition (int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
