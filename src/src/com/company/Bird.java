package com.company;

public class Bird {
    private String common_name;
    private String Latin_name;
    private int observations;

    public Bird(String name, String Latin_name){    // constructor
        this.common_name = name;
        this.Latin_name = Latin_name;
        this.observations = 0;
    }

    public void Sighted(){
        this.observations += 1;
    }

    public String toString(){
        return this.common_name + " (" + this.Latin_name + ") : " + this.observations + " observations";
    }

    public String getCommon_name(){
        return this.common_name;
    }

    public static void main(String[] args){

    }
}
