package com.game;

public abstract class Enemy extends AbstractPlayer {

    protected String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Enemy(String name, int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void attackHero(Hero hero) {
        if (getHealth() > 0) {
            if (hero.isAlive()) {
                actionOnAlivePlayer(hero, getAction(), getDamage());
                hero.takeDamage(getDamage());
            } else {
                actionOnDiedPlayer(hero, getAction());
            }
        } else {
            System.out.println(getName() + " can't attack because ENEMY has died");
        }
        System.out.println();
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        //STUB - only for education
    }
}
