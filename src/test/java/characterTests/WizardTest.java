package characterTests;

import accessories.Creature;
import character.mage.SpellType;
import character.mage.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    Wizard wizard;
    Creature creature;

    @Before
    public void before() {
        wizard = new Wizard("Gandalf", 5,20, 3, 3, "Wizard ", creature, SpellType.BLIZZARD, SpellType.FIREBALL );
    }

    @Test
    public void switchSpell() {
        wizard.switchSpell();
        assertEquals(SpellType.FIREBALL, wizard.getActiveSpell());
    }
}