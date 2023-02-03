package util;

import dev.andrewjfei.util.MathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilTest {

    @Test
    public void testAdd_returnsCorrectResult() {
        int a = 1;
        int b = 21;
        int expected = 22;

        int result = MathUtil.add(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testSubtract_returnsCorrectResult() {
        int a = 22;
        int b = 1;
        int expected = 21;

        int result = MathUtil.subtract(a, b);

        assertEquals(expected, result);
    }
}
