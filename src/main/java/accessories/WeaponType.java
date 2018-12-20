package accessories;

public enum WeaponType {
    SWORD(15),
    AXE(20),
    SPEAR(20),
    BOWANDARROW(5),
    CLUB(40);

    private int damage;



    WeaponType(int damage){this.damage = damage;}

    public int getDamage(){
        return damage;
    }
}
