package com.game;

public class Archer extends Hero {

    protected static final String ACTION = "shoots at";
    public Archer(String name,int health, int damage) {
        super(name, health, damage);
    }

    public void attackEnemy(Enemy enemy) {
        super.setAction(ACTION);
        super.attackEnemy(enemy);
    }
}
