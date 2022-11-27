package com.game;

public class Archer extends Hero {

    private static final String ACTION = "shoots at";

    public Archer(String name,int health, int damage) {
        super(name, health, damage);
    }

    public void attackEnemy(AbstractPlayer enemy) {
        super.setAction(ACTION);
        super.attackEnemy(enemy);
    }
}
