package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BirdwatchersDatabase {
    ArrayList<Bird> database;

    public BirdwatchersDatabase(){
        database = new ArrayList<Bird>();
    }

    public void Add(Bird bird){
        this.database.add(bird);
    }

    public void Observation(String name){
        for (Bird bird : database) {
            if (bird.getCommon_name().equals(name)){
                bird.Sighted();
            } else {
                System.out.println("Is not a bird!");
            }
        }
    }

    public void Statistics(){
        for (Bird bird: database) {
            System.out.println(bird);
        }
    }

    public void Show(String name){
        for (Bird bird : database){
            if (bird.getCommon_name().equals(name)){
                System.out.println(bird);
            }
        }
    }

    public static void main(String[] args){
        BirdwatchersDatabase BirdwatchersDatabase = new BirdwatchersDatabase();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("? ");

            String command = scanner.nextLine();

            if (command.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String Latin_name = scanner.nextLine();
                BirdwatchersDatabase.Add(new Bird(name, Latin_name));
            }
            else if (command.equals("Observation")){
                System.out.print("What was observed? ");
                String bird_seen = scanner.nextLine();
                BirdwatchersDatabase.Observation(bird_seen);
            }
            else if (command.equals("Statistics")){
                BirdwatchersDatabase.Statistics();
            }
            else if (command.equals("Show")){
                System.out.print("What? ");
                String bird = scanner.nextLine();
                BirdwatchersDatabase.Show(bird);
            }
            else if (command.equals("Quit")){
                break;
            }
        }
    }
}
