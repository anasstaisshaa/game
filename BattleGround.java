package com.game;

public class BattleGround {
    public static void main(String[] args) {
        Enemy badMan = new BadMan("Bad Man", 100, 20);
        Enemy zombie = new Zombie("Zombie", 100, 10);
        Hero archer = new Archer("Robbin", 100, 10);
        Hero warrior = new Warrior("Claus", 100, 12);
        Hero mage = new Mage("Old Man", 100, 15);

        badMan.attackHero(warrior);
        zombie.attackHero(warrior);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);

        zombie.attackHero(archer);

        warrior.attackEnemy(zombie);
        mage.attackEnemy(zombie);
    }
}
