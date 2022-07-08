package Lesson4.OOP;

import java.util.Scanner;
import java.util.Random;

public class OOP {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome, " + player.getName());

        while (!player.isDead() && !player.hasWon()) {
            Monster monster = Monster.getRandomMonster();
            System.out.println(String.format("You have encountered a %s (%s)",
                                             monster.getName(), monster.getName().charAt(0)));

            fightMonster(in, player, monster);
        }

        if (player.isDead()) {
            System.out.println(String.format("You died at level %d and with %d gold",
                                             player.getLevel(), player.getGold()));
            System.out.println("Too bad you can't take it with you!");
        }
        else if (player.hasWon()) {
            System.out.println(String.format("You had won with %d gold", player.getGold()));
            System.out.println("Good job!");
        }
    }

    private static void fightMonster(Scanner in, Player player, Monster monster) {
        while (true) {
            System.out.print("(R)un or (F)ight: ");
            String action = in.next();

            if (action.equalsIgnoreCase("r")) {
                Random random = new Random();

                /* 1 - successfully fled, 0 - not */
                if (random.nextInt(2) == 1) {
                    System.out.println("You successfully fled");
                    break;
                }
                else {
                    attackPlayer(player, monster);
                    if (player.isDead()) {break;}
                }
            }
            else if (action.equalsIgnoreCase("f")) {
                attackMonster(player, monster);
                if (monster.isDead()) {
                    player.addGold(monster.gold);
                    player.levelUp();
                    System.out.println("You killed the " + monster.getName());
                    break;
                }
                else {
                    attackPlayer(player, monster);
                    if (player.isDead()) {break;}
                }
            }
        }
    }

    private static void attackMonster(Player player, Monster monster) {
        monster.reduceHealth(player.attack);
        System.out.println(String.format("You hit the %s for %d damage",
                                         monster.getName(), player.getAttack()));
    }

    private static void attackPlayer(Player player, Monster monster) {
        player.reduceHealth(monster.attack);
        System.out.println(String.format("The %s hit you for %d damage",
                monster.getName(), monster.getAttack()));
    }
}
