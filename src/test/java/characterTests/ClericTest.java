package characterTests;

import accessories.Tool;
import character.healer.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Tool tool;

    @Before
    public void before() {
        tool = new Tool("potion", 20);
        cleric = new Cleric("Bob", 10, 100, 5, 0, tool);

    }

    @Test
    public void getHealingTool() {
        assertEquals(tool, cleric.getHealingTool());
    }

    @Test
    public void setHealingTool() {
    }

    @Test
    public void healCharacter() {
    }
}
