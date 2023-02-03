package util;

import dev.andrewjfei.util.StringUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {

    @Test
    public void testConcat_returnsCorrectResult() {
        String a = "res";
        String b = "ult";
        String expected = "result";

        String result = StringUtil.concat(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testLength_returnsCorrectResult() {
        String a = "text";
        int expected = 4;

        int result = StringUtil.length(a);

        assertEquals(expected, result);
    }
}
