package handler;

public class WhizzHandler extends StudentAnswerRuleHandlers {
    @Override
    public String answerDependentRule(int number) {
        if (number % 7 == 0) {
            return WHIZZ;
        }
        return successor.answerDependentRule(number);
    }
}
