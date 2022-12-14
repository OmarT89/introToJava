package com.company;

public class Dog {
    private String name;
    private int age;
    private String color;
    private String breed;

    public Dog(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }
        public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public String bark(){
        return "woof woof";
    }

    public void eat(){
        System.out.println("Dog has eaten ");
    }
    public void eat(String food){
        System.out.println("Dog has eaten " + food);
    }


}
