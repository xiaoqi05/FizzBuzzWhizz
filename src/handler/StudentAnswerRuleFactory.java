package handler;

public class StudentAnswerRuleFactory {

    public static StudentAnswerRuleHandlers createRule() {

        StudentAnswerRuleHandlers fizzHandler = new FizzHandler();
        StudentAnswerRuleHandlers buzzHandler = new BuzzHandler();
        StudentAnswerRuleHandlers whizzHandler = new WhizzHandler();
        StudentAnswerRuleHandlers fizzBuzzHandler = new FizzBuzzHandler();
        StudentAnswerRuleHandlers fizzWhizzHandler = new FizzWhizzHandler();
        StudentAnswerRuleHandlers buzzWhizzHandler = new BuzzWhizzHandler();
        StudentAnswerRuleHandlers fizzBuzzWhizzHandler = new FizzBuzzWhizzHandler();
        StudentAnswerRuleHandlers commonNumberHandler = new CommonNumberHandler();

        fizzHandler.setSuccessor(fizzBuzzWhizzHandler);
        fizzBuzzWhizzHandler.setSuccessor(fizzBuzzHandler);
        fizzBuzzHandler.setSuccessor(fizzWhizzHandler);
        fizzWhizzHandler.setSuccessor(buzzWhizzHandler);
        buzzWhizzHandler.setSuccessor(buzzHandler);
        buzzHandler.setSuccessor(whizzHandler);
        whizzHandler.setSuccessor(commonNumberHandler);

        return fizzHandler;
    }
}
