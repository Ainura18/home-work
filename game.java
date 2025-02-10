class Player {
    private String name;
    private int health = 100;
    private int experience = 0;

    public Player(String name) {
        this.name = name;
    }

    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    public void gainExperience(int xp) {
        experience += xp;
    }

    public int getHealth() { return health; }
    public int getExperience() { return experience; }
}

abstract class Enemy {
    public abstract void attack(Player player);
}

class Goblin extends Enemy {
    public void attack(Player player) {
        player.takeDamage(10);
    }
}

class Dragon extends Enemy {
    public void attack(Player player) {
        player.takeDamage(30);
    }
}

class CombatManager {
    public void fight(Player player, Enemy enemy) {
        enemy.attack(player);
    }
}

abstract class Item {
    public abstract void use(Player player);
}

class HealthPotion extends Item {
    public void use(Player player) {
        player.takeDamage(-20);
    }
}

class ExperienceBoost extends Item {
    public void use(Player player) {
        player.gainExperience(50);
    }
}

class LevelManager {
    private int level = 1;
    private Player player;

    public LevelManager(Player player) {
        this.player = player;
    }

    public void checkLevelUp() {
        if (player.getExperience() >= level * 100) {
            level++;
            System.out.println(player + "жаңа деңгей: " + level + "!");
        }
    }
}

public class Game {
    public static void main(String[] args) {
        Player player = new Player("Айнура");
        Enemy goblin = new Goblin();
        CombatManager combat = new CombatManager();
        LevelManager levelManager = new LevelManager(player);

        combat.fight(player, goblin);
        System.out.println("player health " + player.getHealth());

        player.gainExperience(120);
        levelManager.checkLevelUp();
    }
}
