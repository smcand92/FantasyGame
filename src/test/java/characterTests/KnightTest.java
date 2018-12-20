package characterTests;

import accessories.ArmourType;
import accessories.WeaponType;
import character.melee.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {

    Knight knight;

    @Before
    public void before() {
        knight = new Knight("Shovel", 50, 150, 30, 0, "Knight", WeaponType.SWORD, WeaponType.AXE, ArmourType.HEAVYARMOUR);
    }

    @Test
    public void switchWeapon() {
        knight.switchWeapon();
        assertEquals(WeaponType.AXE, knight.getPrimaryWeapon());
    }
//
//    @Test
//    public void attack() {
//    }
//
//    @Test
//    public void isRoomEmpty() {
//    }
//
//    @Test
//    public void canMoveToNextRoom() {
//    }
//
//    @Test
//    public void searchForEnemy() {
//    }
//
//    @Test
//    public void searchForTreasure() {
//    }
}