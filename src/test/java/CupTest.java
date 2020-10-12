import org.junit.Test;

import static org.junit.Assert.*;

public class CupTest {

    @Test
    public void getLiquidType() {
        Cup c = new Cup("Orange Juice", 85.5);
        assertEquals("Orange Juice", c.getLiquidType());
    }
}