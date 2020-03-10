package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        //Challenge

        int highScorePositon = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePositon);

        highScorePositon = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePositon);

        highScorePositon = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePositon);

        highScorePositon = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePositon);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;  //-1 is used by default to indicate an error.
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int postion = 4;
        if (playerScore >= 1000) {
            postion = 1;
        } else if (playerScore >= 500) {
            postion = 2;
        } else if (playerScore >= 100) {
            postion = 3;
        }
        return postion;
    }
}
