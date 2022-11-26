package com.game;

public class Mage extends Hero {

    protected static final String ACTION = "pulls at";

    public Mage(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attackEnemy(Enemy enemy) {
        super.setAction(ACTION);
        super.attackEnemy(enemy);
    }
}
