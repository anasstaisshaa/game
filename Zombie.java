package com.game;

public class Zombie extends Enemy {

    protected static final String ACTION = "bites at";

    public Zombie(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attackHero(Hero hero) {
        super.setAction(ACTION);
        super.attackHero(hero);
    }
}
