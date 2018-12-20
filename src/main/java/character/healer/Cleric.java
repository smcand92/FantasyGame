package character.healer;

import accessories.Tool;
import character.Character;

public class Cleric extends Character{

    private Tool tool;

    public Cleric(String name, int attack, int health, int defense, int pouch, Tool healingTool) {
        super(name, attack, health, defense, pouch);
        this.tool = healingTool;
    }

    public Tool getHealingTool() {
        return tool;
    }

    public void setHealingTool(Tool healingTool) {
        this.tool = healingTool;
    }

    public void healCharacter(Character character){
        character.getHealth() += tool.getHealingStrength();
    }


}
