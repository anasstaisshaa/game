package com.game;

public class Warrior extends Hero{

    protected static final String ACTION = "enters the battlefield and goes to";

    public Warrior(String name,int health,  int damage) {
        super(name, health, damage);
    }

    public void attackEnemy(Enemy enemy) {
        super.setAction(ACTION);
        super.attackEnemy(enemy);
    }
}
