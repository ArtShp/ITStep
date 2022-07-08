package Lesson4.OOP;

import java.util.Scanner;

class Player extends Creature{
    private int level;

    Player() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = in.next();
        level = 1;
        health = 100;
        attack = 1;
        gold = 0;
    }

    int getLevel() {return level;}

    void levelUp() {
        level++;
        attack++;
    }

    boolean hasWon() {
        return (level >= 20);
    }
}
