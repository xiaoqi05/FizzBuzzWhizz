package handler;

public class BuzzHandler extends StudentAnswerRuleHandlers {
    @Override
    public String answerDependentRule(int number) {
        if (number % 5 == 0) {
            return BUZZ;
        }
        return successor.answerDependentRule(number);
    }
}
