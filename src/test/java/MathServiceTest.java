import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

public class MathServiceTest {
    MathService mathService;

    @Before
    public void setup(){
        mathService = new MathService();
    }

    @Test
    public void doubleNum(){
        Assert.assertEquals(8,mathService.doubleNum(4));
    }

    @Test
    public void factorial(){
        Assert.assertEquals(120,mathService.factorial(5));
    }

    @Test
    public void factorialZero(){
        Assert.assertEquals(1,mathService.factorial(0));
    }
    @Test
    public void factorialNegative(){
        Assert.assertThrows(IllegalArgumentException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                mathService.factorial(-2);
            }
        });
    }
    @Test(expected = IllegalArgumentException.class)
    public void factorialNegativeAnnotated(){
        Assert.assertEquals(5,mathService.factorial(-1));
    }

}
