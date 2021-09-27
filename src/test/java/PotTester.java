import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;
public class PotTester {
    Pot p;

    @Before
    public void setUp() throws Exception {
        p = new Pot();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(50, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        p.upgradeSpeed();
        assertEquals(50, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        p.downgradeSpeed();
        assertEquals(49, p.getMaxSpeed());
    }

}
