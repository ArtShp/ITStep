package Lesson4.OOP;

abstract class Creature {
    int health;
    int attack;
    int gold;
    String name;

    Creature() {}

    int getHealth() {return health;}
    int getAttack() {return attack;}
    int getGold() {return gold;}
    String getName() {return name;}

    void reduceHealth(int amount) {
        health -= amount;
    }

    boolean isDead() {
        return (health <= 0);
    }

    void addGold(int amount) {
        gold += amount;
    }
}
