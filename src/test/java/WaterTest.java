import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterTest {

    Water water;

    @Before
    public void before(){
        water = new Water(100.0);
    }

    @Test
    public void has100(){
        assertEquals(100.0, water.getVolume());
    }

    @Test
    public void drinkTest(){
        assertEquals(90.0, water.drink());
    }

    @Test
    public void emptyTest(){
        assertEquals(0.0,water.emptyBottle());
    }

    @Test
    public void fillTest(){
        assertEquals(100.0, water.fillBottle());
    }
}
