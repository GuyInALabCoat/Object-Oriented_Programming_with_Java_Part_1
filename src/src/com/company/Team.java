package com.company;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maximumSize;

    private Team(String name){
        this.name = name;       // constructor sets the name of the team to given name
        players = new ArrayList<Player>();
        this.maximumSize = 16;
    }

    private String getName(){
        return this.name;
    }

    private void addPlayer(Player player){
        if (this.size() < this.maximumSize) {
            players.add(player);    // adds players to the team if < maxSize
        }
    }

    private void printPlayers(){
        for (Player player : players) {
            System.out.println(player);
        }
    }

    private void setMaxSize(int maxSize){
        this.maximumSize = maxSize;
    }

    private int size(){
        return players.size();
    }

    private int goals(){
        int sum = 0;
        for (Player player : players) {
            sum += player.goals();
        }

        return sum;
    }

    public static void main(String[] args){
        Team barcelona = new Team("FC Barcelona");

            Player brian = new Player("Brian");
            Player pekka = new Player("Pekka", 39);

            barcelona.addPlayer(brian);
            barcelona.addPlayer(pekka);
            barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as above

        System.out.println("Total goals: " + barcelona.goals());
    }
}
