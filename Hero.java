package com.game;

public abstract class Hero extends AbstractPlayer {

    protected String action;

    public Hero(String name, int health, int damage) {
        this.health = health;
        this.name = name;
        this.damage = damage;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (getHealth() > 0) {
            if (enemy.isAlive()) {
                actionOnAlivePlayer(enemy, getAction(), getDamage());
                enemy.takeDamage(getDamage());
            } else {
                actionOnDiedPlayer(enemy, getAction());
            }
        } else {
            System.out.println(getName() + " can't attack because HERO has died");
        }
        System.out.println();
    }

    @Override
    public void attackHero(Hero hero) {
        //STUB - only for education
    }
}
