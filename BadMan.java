package com.game;

public class BadMan extends Enemy {

    protected static final String ACTION = "beats at";

    public BadMan(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attackHero(Hero hero) {
        super.setAction(ACTION);
        super.attackHero(hero);
    }
}
