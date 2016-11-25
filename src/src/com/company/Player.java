package com.company;

public class Player {
    private String playerName;
    private int goals;

    public Player(String nameOfPlayer, int numberOfGoals){
        this.playerName = nameOfPlayer;     // initializes the name of the player and goals
        this.goals = numberOfGoals;
    }

    public Player(String nameOfPlayer){
        this.playerName = nameOfPlayer;     // initializes only the name of the player
    }

    public String getName(){
        return this.playerName;
    }

    public int goals(){
        return this.goals;
    }

    public String toString(){
        return this.getName() + ", goals " + this.goals();
    }
}
