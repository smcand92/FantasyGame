package character.melee;

import accessories.WeaponType;
import character.Character;
import character.interfacesForCharacters.IAttack;

public class Enemy extends Character implements IAttack {

    private WeaponType primaryWeapon;

    public Enemy(String name, int attack, int health, int defense, int pouch, String type, WeaponType primaryWeapon) {
        super(name, attack, health, defense, pouch, type);

        this.primaryWeapon = primaryWeapon;
    }

    @Override
    public void attack(Character character) {

    }
}
