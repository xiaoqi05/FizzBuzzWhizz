import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzWhizzTest {

    private FizzBuzzWhizz fizzBuzzWhizz;

    @Before
    public void setUp() throws Exception {
        int[] specialNumberList = {3, 5, 7};
        fizzBuzzWhizz = new FizzBuzzWhizz(specialNumberList);
    }

    @Test
    public void shouldSpeakFizzWhenCallNumberIsOnlyMultipleTheFirstSpecialNumber() throws Exception {
        Assert.assertEquals("Fizz", fizzBuzzWhizz.speak(3));
    }

    @Test
    public void shouldSpeakBuzzWhenCallNumberIsOnlyMultipleTheSecondSpecialNumber() throws Exception {
        Assert.assertEquals("Buzz", fizzBuzzWhizz.speak(5));
    }

}
