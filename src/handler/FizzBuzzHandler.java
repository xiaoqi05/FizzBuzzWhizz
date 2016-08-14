package handler;

public class FizzBuzzHandler extends StudentAnswerRuleHandlers {
    @Override
    public String answerDependentRule(int number) {
        if (number % 5 == 0 && number % 3 == 0 && number % 7 != 0) {
            return FIZZ + BUZZ;
        }
        return successor.answerDependentRule(number);
    }
}
