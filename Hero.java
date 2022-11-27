package com.game;

public abstract class Hero extends AbstractPlayer {

    protected String action;

    protected Hero(String name, int health, int damage) {
        super.health = health;
        super.name = name;
        super.damage = damage;
    }

    private String getAction() {
        return action;
    }

    protected void setAction(String action) {
        this.action = action;
    }

    private int getDamage() {
        return damage;
    }

    @Override
    public void attackEnemy(AbstractPlayer enemy) {
        if (getHealth() > 0) {
            if (enemy.isAlive()) {
                actionOnAlivePlayer(enemy, getAction(), getDamage());
                enemy.takeDamage(getDamage());
            } else {
                actionOnDiedPlayer(enemy, getAction());
            }
        } else {
            System.out.println(getName() + " can't attack because " + getName() +" has died");
        }
        System.out.println();
    }

    @Override
    public void attackHero(AbstractPlayer hero) {
        //STUB - only for education
    }
}
