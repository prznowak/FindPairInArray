import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pinq on 15.11.17.
 */
public class MainTest {
    @Test
    public void finPairShouldReturnTrue() {
        assertTrue(Main.findSum(new int[]{1, 8, 9},10));
    }

    @Test
    public void finPairShouldReturnFalse() {
        assertFalse(Main.findSum(new int[]{1, 1, 1},10));
    }

    @Test
    public void finPairShouldReturnFalse2() {
        assertFalse(Main.findSum(new int[]{1, 8, 9, 0, 1, 1, 0, 5},11));
    }

    @Test
    public void finPairShouldReturnFalse3() {
        assertFalse(Main.findSum(new int[]{1,9},20));
    }



}