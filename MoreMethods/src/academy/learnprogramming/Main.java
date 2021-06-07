package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000,8, 200);

        calculateScores(false, 800, 5,100);

        int highScore = calculateScores(false, 800, 5,100);

        System.out.println("Your final score was " + highScore);

    } // main method; can't put one method in another method

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score +(levelCompleted * bonus);
            finalScore += 1000;
            System.out.println(" Your final score is " + finalScore);
        }
        // creating a method, void = no return value
    }

    public static int calculateScores(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

}

