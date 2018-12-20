package character.mage;

public enum SpellType {

    FIREBALL(50), BLIZZARD(75), THUNDER(10), STINKBOMB(0);

    private int damage;

    SpellType(int damage){this.damage = damage;}

    public int getDamage(){
        return damage;
    }
}
