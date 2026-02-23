import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConversionsTest {
    private static Conversions c;
    @BeforeAll
    public static void setup() {
        c = new Conversions();
    }


    @Test
    public void euroToDollarDefaultValue() {
        double result = c.euroToDollar(100);
        assertEquals(110, result, 0.001);
    }

    @Test
    public void euroToDollarNegativeValue() {
        double result = c.euroToDollar(-100);
        assert(result==0);
    }

    @Test
    public void euroToDollarZeroValue() {
        double result = c.euroToDollar(0);
        assert(result==0);
    }


}
