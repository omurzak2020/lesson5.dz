package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero thor = new Hero(123,123,"молния");
        Hero human = new Hero(321,321);
        System.out.println("Health: "
                + thor.getHealth() + " Damage: " + thor.getDamage()
                + " SuperAbility: " + thor.getSuperAbility());

        Boss rab = new Boss(170,100,"myssa");
        System.out.println("health: " + rab.getHealth() + " Damage:" +
                " " + rab.getDamage() + " Defend: " + rab.getDefend());
    }
}
