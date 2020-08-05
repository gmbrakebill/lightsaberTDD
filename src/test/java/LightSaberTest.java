import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {

    @Test
    public void testingCharge()
    {
        LightSaber light = new LightSaber(1);
        float expected = 50f;
        light.setCharge(50f);
        float actual = light.getCharge();

        assertEquals(expected,actual);

    }
    @Test
    public void testingColor()
    {
        LightSaber light = new LightSaber(2);
        String expected = "Blue";
        light.setColor("Blue");
        String actual = light.getColor();
        assertEquals(expected,actual);
    }
    @Test
    public void testSerialNumber()
    {
        LightSaber light = new LightSaber(3);
        float expected = 3;
        long actual = light.getJediSerialNumber();
        assertEquals(expected,actual);
    }
    @Test
    public void testUseCharge()
    {
        LightSaber light = new LightSaber(4);
        light.use(3);
        double expected = 99.5;
        float actual = light.getCharge();
        assertEquals(expected,actual);

    }
    @Test
    public void testMinutesRemaining()
    {
        LightSaber light = new LightSaber(5);
        light.use(5);
        double expected = 297.4999694824219;
        float actual = light.getRemainingMinutes();
        assertEquals(expected,actual);

    }
    @Test
    public void testRecharge()
    {
        LightSaber light = new LightSaber(5);
        light.setCharge(20);
        light.recharge();
        float expected = 100;
        float actual = light.getCharge();

        assertEquals(expected,actual);





    }
}
