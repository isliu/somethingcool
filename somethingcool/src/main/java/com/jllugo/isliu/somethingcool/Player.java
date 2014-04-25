package com.jllugo.isliu.somethingcool;

public class Player {
    private static final int MAX_HEALTH = 100;

    private int health;
    private String name;
    private Craft craft;

    public Player(String name, Craft craft) {
        this.name = name;
        this.craft = craft;
        health = MAX_HEALTH;
    }
}

