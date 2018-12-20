package character.melee;

import accessories.ArmourType;
import accessories.WeaponType;

public class Dwarf extends Warrior{

    public Dwarf(String name, int attack, int health, int defense, int pouch, String type, WeaponType primaryWeapon, WeaponType secondaryWeapon, ArmourType armour) {
        super(name, attack, health, defense, pouch, type, primaryWeapon, secondaryWeapon, armour);
    }
}
