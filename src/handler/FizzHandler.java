package handler;

public class FizzHandler extends StudentAnswerRuleHandlers {

    @Override
    public String answerDependentRule(int number) {
        if ((number % specialNumbers[0] == 0 && number % specialNumbers[1] != 0 && number % specialNumbers[2] != 0) || Integer.valueOf(number).toString().contains(String.valueOf(specialNumbers[0]))) {
            return FIZZ;
        }
        return successor.answerDependentRule(number);
    }
}
