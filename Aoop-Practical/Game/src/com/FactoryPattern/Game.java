package com.FactoryPattern;

public class Game {
	
	private static Game instance;
    private int currentLevel;
    private String difficulty;
    private int playerScore;

    private Game() {
        currentLevel = 1;
        difficulty = "Easy";
        playerScore = 0;
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public void nextLevel() {
        currentLevel++;
        System.out.println("Level " + currentLevel + " started.");
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
        System.out.println("Difficulty set to: " + difficulty);
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void addScore(int points) {
        playerScore += points;
        System.out.println("Player's score: " + playerScore);
    }

}
