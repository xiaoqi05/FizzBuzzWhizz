package handler;

public class FizzHandler extends StudentAnswerRuleHandlers {

    @Override
    public String answerDependentRule(int number) {
        if ((number % 3 == 0 && number % 5 != 0 && number % 7 != 0) || Integer.valueOf(number).toString().contains("3")) {
            return FIZZ;
        }
        return successor.answerDependentRule(number);
    }
}
