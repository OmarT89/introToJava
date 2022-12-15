package com.company;

public class Main {
    public static void main(String[] args) {

//        Your code here
        Player alice = new Player("Alice", 20, "Female");
        Player john = new Player("John",25,"Male");
         int alice_total = 0, john_total = 0;
         int alice_current_roll = 0, john_current_roll = 0;

//         Game begins here
while(alice_total<10 && john_total < 10) {
    alice_current_roll = alice.roll();
    john_current_roll = john.roll();

    System.out.println("Alice rolled " + alice_current_roll + " and " + "John rolled " + john_current_roll);

    alice_total = alice_current_roll + alice_total;
    john_total = john_current_roll + john_total;

    }

    if (alice_total >=10) {
        System.out.println("Alice won the game");
    }
    else {
        System.out.println("John has wont the game");
    }



//Dog Properties/Classes & Methods
/*

    Dog sherlock = new Dog("Sherlock",6,"White", "Labrador");
    Dog watson = new Dog("Watson", 7, "Green");

    sherlock.eat();
    sherlock.eat("Some meat");

//Point&Line Main
        /*
        Point firstPoint = new Point(3.0,4.0);
        Point secondPoint = new Point(7.0, 10.0);

        Line ourLine = new Line(firstPoint, secondPoint);

        System.out.println("Gradient: " + ourLine.gradient());
        System.out.println("Length: " + ourLine.findLength());
        */
    }
}