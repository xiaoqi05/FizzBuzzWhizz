package handler;

public class CommonNumberHandler extends StudentAnswerRuleHandlers {

    @Override
    public String answerDependentRule(int number) {
        return Integer.toString(number);
    }
}
