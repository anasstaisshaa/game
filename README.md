# HERO playground

## Steps

1. Создать класс Hero, представляющий собой героя и содержит поле name. 

   1. Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
   2. Добавить метод attackEnemy(), выводящий в консоль сообщение о том , что герой аттакует врага.
   3. Создать класс TrainingGround, содержащий метод main. Протестировать создание героя и его аттаку.


1. Создать классы Warrior, Mage, Archer, представляющие собой наследники класса Hero.
   1. Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.
   2. Протестировать создание героев различных классов и их атаки в классе TrainingGround().


1. Создать класс Enemy, представляющий собой врага и содержит поле health (кол-во здоровья).
   1. Добавить конструктор, принимающий количество здоровья, а также сеттер и геттер.
   2. Добавить метод takeDamage(int damage), который уменьшает количество здоровья в соответствии с полученным уроном. 
   3. Переписать метод attackEnemy класса Hero, добавив ему параметр типа Enemy. 
   4. Метод должен вызывать у врага метод takeDamage и передавать в него определенное количество урона. 
   5. Переопределить метод в подклассах так , чтобы каждый герой наносил врагу разное кол-во урона.


6. Сделать класс Hero и метод attackEnemy абстрактными.

7. Создать интерфейс Mortal, содержащий метод isAlive().
   1. Сделать так, чтобы класс Enemy реализовал интерфейс Mortal. 
   2. Опредлелить метод isAlive в классе Enemy так, чтобы тот возвращал true, если количество здоровья врага больше 0.


8. Добавить героям показатель здоровья и возможность погибнуть.
   1. Добавить врагу возможность аттаковать. 
   2. Создать несколько видов врагов.


9. Создать класс BattleGround с методом main, котором создать симуляцию боя.
      
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