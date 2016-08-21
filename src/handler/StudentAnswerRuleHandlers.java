package handler;

public abstract class StudentAnswerRuleHandlers {
    protected static final String FIZZ = "Fizz";
    protected static final String BUZZ = "Buzz";
    protected static final String WHIZZ = "Whizz";
    protected static int[] specialNumbers;


    protected StudentAnswerRuleHandlers successor;

    public static void setSpecialNumbers(int[] specialNumbers) {
        StudentAnswerRuleHandlers.specialNumbers = specialNumbers;
    }

    public void setSuccessor(StudentAnswerRuleHandlers successor) {
        this.successor = successor;
    }

    public abstract String answerDependentRule(int number);

}
