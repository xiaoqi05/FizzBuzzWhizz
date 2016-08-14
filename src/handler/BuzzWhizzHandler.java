package handler;

public class BuzzWhizzHandler extends StudentAnswerRuleHandlers {
    @Override
    public String answerDependentRule(int number) {
        if (number % 5 == 0 && number % 3 != 0 && number % 7 == 0) {
            return BUZZ + WHIZZ;
        }
        return successor.answerDependentRule(number);
    }
}
