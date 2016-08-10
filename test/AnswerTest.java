import fizzbuzzwhizz.Answer;
import org.junit.Assert;
import org.junit.Test;

public class AnswerTest {

    private int[] specialNumberList = {3, 5, 7};


    @Test
    public void shouldSpeakFizzWhenCallNumberContainTheFirstSpecialNumber() {
        Assert.assertEquals("Fizz", Answer.answer(13, specialNumberList));
    }

    @Test
    public void shouldSpeakFizzBuzzWhizzWhenCallNumberMultipleAllSpecialNumber() {
        Assert.assertEquals("FizzBuzzWhizz", Answer.answer(3 * 5 * 7, specialNumberList));

    }

    @Test
    public void shouldSpeakTwoSpecialStringWhenCallNumberMultipleTwoSpecialNumber() {
        int[] specialNumberList = {3, 5, 8};
        Assert.assertEquals("FizzBuzz", Answer.answer(3 * 5, specialNumberList));
        Assert.assertEquals("FizzWhizz", Answer.answer(3 * 8, specialNumberList));
        Assert.assertEquals("BuzzWhizz", Answer.answer(5 * 8, specialNumberList));
    }


    @Test
    public void shouldSpeakOneSpecialStringWhenCallNumberIsOnlyMultipleTheFirstSpecialNumber() {
        Assert.assertEquals("Fizz", Answer.answer(3, specialNumberList));
        Assert.assertEquals("Buzz", Answer.answer(5, specialNumberList));
        Assert.assertEquals("Whizz", Answer.answer(7, specialNumberList));
    }


    @Test
    public void shouldSpeakNumberWhenCallNumberNotMultipleSpecialNumber() {
        Assert.assertEquals("8", Answer.answer(8, specialNumberList));
    }


}