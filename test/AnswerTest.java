import fizzbuzzwhizz.Answer;
import org.junit.Assert;
import org.junit.Test;

public class AnswerTest {

    int[] specialNumberList = {3, 5, 7};


    @Test
    public void shouldSpeakFizzWhenCallNumberContainTheFirstSpecialNumber() throws Exception {
        Assert.assertEquals("Fizz", Answer.answer(13, specialNumberList));
    }

    @Test
    public void shouldSpeakFizzBuzzWhizzWhenCallNumberMultipleAllSpecialNumber() throws Exception {
        Assert.assertEquals("fizzbuzzwhizz.FizzBuzzWhizz", Answer.answer(3*5*7, specialNumberList));

    }

    @Test
    public void shouldSpeakTwoSpecialStringWhenCallNumberMultipleTwoSpecialNumber() throws Exception {
        Assert.assertEquals("FizzBuzz", Answer.answer(3*5, specialNumberList));
        Assert.assertEquals("FizzWhizz",Answer.answer(3*7, specialNumberList));
        // Assert.assertEquals("BuzzWhizz", fizzbuzzwhizz.Answer.answer(5*5*7, specialNumberList));
    }


    @Test
    public void shouldSpeakOneSpecialStringWhenCallNumberIsOnlyMultipleTheFirstSpecialNumber() throws Exception {
        Assert.assertEquals("Fizz", Answer.answer(3, specialNumberList));
        Assert.assertEquals("Buzz", Answer.answer(5, specialNumberList));
        Assert.assertEquals("Whizz", Answer.answer(7, specialNumberList));
    }


    @Test
    public void shouldSpeakNumberWhenCallNumberNotMultipleSpecialNumber() throws Exception {
        Assert.assertEquals("8", Answer.answer(8, specialNumberList));
    }


}