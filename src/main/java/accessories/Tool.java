package accessories;

public class Tool {
    private String name;
    private int healingStrength;

    public Tool(String name, int healingStrength){
        this.name = name;
        this.healingStrength = healingStrength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealingStrength() {
        return healingStrength;
    }

    public void setHealingStrength(int healingStrength) {
        this.healingStrength = healingStrength;
    }
}
