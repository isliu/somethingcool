package com.jllugo.isliu.somethingcool;

import java.util.Scanner;

public class Game {
    private Player player;
    private Room currentRoom;

    public Game(Player player, Room currRoom) {
        this.player = player;
        this.currentRoom = currentRoom;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name, fellow traveller?");
        String playerName = scanner.nextLine();

        System.out.println("What is your craft, " + playerName + "?");
        System.out.println("(Note you can only choose from wizard, cobbler, ballerina, and mime)");

        String craftName = scanner.nextLine();

        Craft craft = Craft.fromName(craftName);
        Player player = new Player(playerName, craft);

        System.out.println(playerName + ", you are now a " + craft.name() + "!");
    }
}
