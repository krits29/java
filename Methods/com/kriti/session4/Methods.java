package com.kriti.session4;

public class Methods
{
    public static void main(String[] args)
    {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("your final score was " + highScore);

        calculateScore(true, 10000, 8, 200);
        System.out.println("your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim ", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob ", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("John ", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Billy ", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {

        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        else
        {
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int position)
    {
        System.out.println(name + "managed to get to POSITION " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score, )
    {
        int position = 4;

        if(score >= 1000)
        {
            position = 1;
        }
        else if(score >= 500 && score < 1000)
        {
            position = 2;
        }
        else if(score >= 100 && score < 500)
        {
            position = 3;
        }

        return position;

    }


}
