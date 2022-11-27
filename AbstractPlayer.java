package com.game;

public abstract class AbstractPlayer implements Mortal {
    protected int health;
    protected int damage;
    protected String name;

    protected void actionOnAlivePlayer(AbstractPlayer player, String action, int damage) {
        System.out.println(getName() + " " + action + " " + player.getName() + " and deals " + damage + " hp");
    }

    protected void actionOnDiedPlayer(AbstractPlayer player, String action) {
        System.out.println(getName() + " " + action + " died " + player.getName());
    }

    protected abstract void attackHero(AbstractPlayer hero);

    protected abstract void attackEnemy(AbstractPlayer enemy);

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    protected String getName() {
        return name;
    }

    protected int getHealth() {
        return health;
    }

    protected void takeDamage(int damage) {
        if (health > damage) {
            this.health -= damage;
            System.out.println(getName() + " have " + getHealth() + " health");
        } else {
            this.health -= health;
            System.out.println(getName() + " has been killed");
        }
    }

}
