import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExampleTest extends Assert {

    @Before
    public void setUp() {
        System.out.println("Перед каждым тестом");
    }

    @Test
    public void testSum() {
        assertEquals(5, Sum.sum(2, 3));
    }

    @Test
    public void testSum2() {
        assertEquals(2000, Sum.sum(1000, 1000));
    }
}
