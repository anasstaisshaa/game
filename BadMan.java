package com.game;

public class BadMan extends Enemy {

    private static final String ACTION = "beats at";

    public BadMan(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attackHero(AbstractPlayer hero) {
        super.setAction(ACTION);
        super.attackHero(hero);
    }
}
