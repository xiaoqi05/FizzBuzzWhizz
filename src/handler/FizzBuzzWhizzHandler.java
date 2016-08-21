package handler;

public class FizzBuzzWhizzHandler extends StudentAnswerRuleHandlers {
    @Override
    public String answerDependentRule(int number) {
        if (number % specialNumbers[1] == 0 && number % specialNumbers[0] == 0 && number % specialNumbers[2] == 0) {
            return FIZZ + BUZZ + WHIZZ;
        }
        return successor.answerDependentRule(number);
    }
}
