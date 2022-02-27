package StepsObject;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestJunit {
    @Test

    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }
}
