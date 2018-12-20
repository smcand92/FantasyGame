package character.mage;
import accessories.Creature;
import character.mage.SpellType;
import character.Character;

public class Wizard extends Character {
    private Creature creature;
    private SpellType activeSpell;
    private SpellType secondarySpell;


    public Wizard(String name, int attack, int health, int defense, int pouch, String type, Creature creature, SpellType activeSpell, SpellType secondarySpell) {
        super(name, attack, health, defense, pouch, type);
        this.creature = creature;
        this.activeSpell = activeSpell;
        this.secondarySpell = secondarySpell;

    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public SpellType getActiveSpell() {
        return activeSpell;
    }

    public void setActiveSpell(SpellType activeSpell) {
        this.activeSpell = activeSpell;
    }

    public SpellType getSecondarySpell() {
        return secondarySpell;
    }

    public void setSecondarySpell(SpellType secondarySpell) {
        this.secondarySpell = secondarySpell;
    }

    public void switchSpell(){
        SpellType formerlyActiveSpell = this.activeSpell;
        this.activeSpell = secondarySpell;
        this.secondarySpell = formerlyActiveSpell;

    }
}
