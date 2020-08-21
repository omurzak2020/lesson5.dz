package com.company;

public class Boss {
private int health;
private int damage;
private String defend;

    public Boss(int health, int damage, String defend) {
        this.health = health;
        this.damage = damage;
        this.defend = defend;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefend() {
        return defend;
    }

    public void setDefend(String defend) {
        this.defend = defend;
    }
}
