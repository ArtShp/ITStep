package Lesson3;

import java.util.Random;

public class OOP {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[5];
        for (int i=0; i<monsters.length; i++) {
            monsters[i] = MonsterGenerator.generateMonster();
        }
        for (Monster m: monsters) {
            System.out.println(m);
        }
    }
}


class Monster{
    public enum MonsterType {
        Dragon,
        Goblin,
        Ogre,
        Orc,
        Skeleton,
        Troll,
        Vampire,
        Zombie,
        MAX_MONSTER_TYPES
    }

    private MonsterType type;
    private String name;
    private int health;

    public Monster(MonsterType type, String name, int health) {
        this.name = name;
        this.health = health;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("The %s has %d health points", name, health);
    }
}


class MonsterGenerator {
    public static Monster generateMonster() {
        return new Monster(Monster.MonsterType.values()[getRandomNumber(0, Monster.MonsterType.MAX_MONSTER_TYPES.ordinal()-1)],
                "Monster "+getRandomNumber(1, 1000), getRandomNumber(1, 100));
    }

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max-min+1) + min;
    }
}
