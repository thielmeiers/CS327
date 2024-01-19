package dice;

import org.junit.Test;
import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void checkDiceInRange() {
        Dice dice = new Dice();

        for (int i = 0; i < 100; i++) {
            int result = dice.roll(6);

            // Assert that the result is greater than or equal to 1
            assertTrue(result >= 1);

            // Assert that the result is less than or equal to 6
            assertTrue(result <= 6);
        }
    }
}
