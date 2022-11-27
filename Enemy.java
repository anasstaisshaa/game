package com.game;

public abstract class Enemy extends AbstractPlayer {

    protected String action;

    private String getAction() {
        return action;
    }

    protected void setAction(String action) {
        this.action = action;
    }

    protected Enemy(String name, int health, int damage) {
        super.health = health;
        super.damage = damage;
        super.name = name;
    }

    private int getDamage() {
        return damage;
    }

    @Override
    public void attackHero(AbstractPlayer hero) {
        if (getHealth() > 0) {
            if (hero.isAlive()) {
                actionOnAlivePlayer(hero, getAction(), getDamage());
                hero.takeDamage(getDamage());
            } else {
                actionOnDiedPlayer(hero, getAction());
            }
        } else {
            System.out.println(getName() + " can't attack because " + getName() +" has died");
        }
        System.out.println();
    }

    @Override
    public void attackEnemy(AbstractPlayer enemy) {
        //STUB - only for education
    }
}
