package character;

public abstract class Character {

    private String name;
    private int attack;
    private int health;
    private int defense;
    private int pouch;

    public Character(String name, int attack, int health, int defense, int pouch) {
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
        this.pouch = pouch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getPouch() {
        return pouch;
    }

    public void setPouch(int pouch) {
        this.pouch = pouch;
    }
}
