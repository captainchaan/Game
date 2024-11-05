package ru.netology.stats;

public class Player {

    private int id;
    private String name;
    private int strength;

    public Player(int id, String name, int strenght) {
        this.id = id;
        this.name = name;
        this.strength = strenght;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }


}

