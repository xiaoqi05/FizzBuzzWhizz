import fizzbuzzwhizz.Student;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    private int[] specialNumberList = {3, 5, 7};


    @Test
    public void shouldSpeakFizzWhenCallNumberContainTheFirstSpecialNumber() {
        Assert.assertEquals("Fizz", Student.answer(13, specialNumberList));
    }

    @Test
    public void shouldSpeakFizzBuzzWhizzWhenCallNumberMultipleAllSpecialNumber() {
        Assert.assertEquals("FizzBuzzWhizz", Student.answer(3 * 5 * 7, specialNumberList));

    }

    @Test
    public void shouldSpeakTwoSpecialStringWhenCallNumberMultipleTwoSpecialNumber() {
        int[] specialNumberList = {3, 5, 8};
        Assert.assertEquals("FizzBuzz", Student.answer(3 * 5, specialNumberList));
        Assert.assertEquals("FizzWhizz", Student.answer(3 * 8, specialNumberList));
        Assert.assertEquals("BuzzWhizz", Student.answer(5 * 8, specialNumberList));
    }


    @Test
    public void shouldSpeakOneSpecialStringWhenCallNumberIsOnlyMultipleTheFirstSpecialNumber() {
        Assert.assertEquals("Fizz", Student.answer(3, specialNumberList));
        Assert.assertEquals("Buzz", Student.answer(5, specialNumberList));
        Assert.assertEquals("Whizz", Student.answer(7, specialNumberList));
    }


    @Test
    public void shouldSpeakNumberWhenCallNumberNotMultipleSpecialNumber() {
        Assert.assertEquals("8", Student.answer(8, specialNumberList));
    }


}