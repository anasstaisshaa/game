package com.game;

public class Zombie extends Enemy {

    private static final String ACTION = "bites at";

    public Zombie(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attackHero(AbstractPlayer hero) {
        super.setAction(ACTION);
        super.attackHero(hero);
    }
}
