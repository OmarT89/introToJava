package com.company;

public class Player {

    private String name;
    private int age;
    private String gender;

//    Constructor: define how to construct a player
    public Player(String inputName, int input_age) {
        this.name = inputName;
        this.age = input_age;
    }

    public Player(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

//    method named roll
    public int roll() {
        return ((int) (Math.random()* (6-1))) + 1;
    }
}
