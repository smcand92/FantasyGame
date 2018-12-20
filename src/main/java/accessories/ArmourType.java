package accessories;

public enum ArmourType {
    SHEILD(30, 50),
    HEAVYARMOUR(50, 20),
    BUTTPAN(10,1);


    private int defense;
    private int hitPoints;

    ArmourType(int defense, int hitPoints){
        this.defense = defense;
        this.hitPoints = hitPoints;
    }

    public int getDefense() {
        return defense;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
