package Lesson4.OOP;

import java.util.Random;

class Monster extends Creature {
    public enum Type {
        DRAGON,
        ORC,
        SLIME,
        MAX_TYPES
    }

    private Monster(Type type) {
        switch (type) {
            case DRAGON:
                this.name = "dragon";
                this.health = 20;
                this.attack = 4;
                this.gold = 100;
                break;
            case ORC:
                this.name = "orc";
                this.health = 4;
                this.attack = 2;
                this.gold = 25;
                break;
            case SLIME:
                this.name = "slime";
                this.health = 1;
                this.attack = 1;
                this.gold = 10;
                break;
        }
    }

    static Monster getRandomMonster() {
        Random random = new Random();
        return new Monster(Type.values()[random.nextInt(Type.MAX_TYPES.ordinal())]);
    }
}
