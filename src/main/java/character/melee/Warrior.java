package character.melee;
import accessories.ArmourType;
import accessories.WeaponType;
import character.Character;
import character.interfacesForCharacters.IAttack;
import character.interfacesForCharacters.ICanMoveToNextRoom;
import character.interfacesForCharacters.ISearchForEnemy;
import character.interfacesForCharacters.ISearchForTreasure;
import room.Room;


public abstract class Warrior extends Character implements IAttack, ISearchForEnemy, ISearchForTreasure, ICanMoveToNextRoom {

    private WeaponType primaryWeapon;
    private WeaponType secondaryWeapon;
    private ArmourType armour;

    public Warrior(String name, int attack, int health, int defense, int pouch, String type, WeaponType primaryWeapon, WeaponType secondaryWeapon, ArmourType armour) {
        super(name, attack, health, defense, pouch, type);

        this.primaryWeapon = primaryWeapon;
        this.secondaryWeapon = secondaryWeapon;
        this.armour = armour;
    }

    public WeaponType getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(WeaponType primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public WeaponType getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public void setSecondaryWeapon(WeaponType secondaryWeapon) {
        this.secondaryWeapon = secondaryWeapon;
    }

    public ArmourType getArmour() {
        return armour;
    }

    public void setArmour(ArmourType armour) {
        this.armour = armour;
    }

    public void switchWeapon(){
        WeaponType formerPrimaryWeapon = this.primaryWeapon;
        this.primaryWeapon = secondaryWeapon;
        this.secondaryWeapon = formerPrimaryWeapon;

    }

    @Override
    public void attack(Character character) {

    }

    @Override
    public boolean isRoomEmpty(Room room) {
        return false;
    }

    @Override
    public String canMoveToNextRoom(Room room) {
        return null;
    }

    @Override
    public String searchForEnemy(Room room) {
        return null;
    }

    @Override
    public String searchForTreasure(Room room) {
        return null;
    }
}
