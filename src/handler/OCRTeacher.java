package handler;

public class OCRTeacher {


    protected StudentAnswerRuleHandlers studentAnswerRuleHandlers;

    public void setStudentAnswerRuleHandlers(StudentAnswerRuleHandlers studentAnswerRuleHandlers) {
        StudentAnswerRuleHandlers.setSpecialNumbers(new int[]{2, 3, 4});
        this.studentAnswerRuleHandlers = studentAnswerRuleHandlers;
    }

    public String requestStudentAnswer(int number) {
        return studentAnswerRuleHandlers.answerDependentRule(number);
    }

    public static void main(String[] args) {
        OCRTeacher ocrTeacher = new OCRTeacher();
        ocrTeacher.setStudentAnswerRuleHandlers(StudentAnswerRuleFactory.createRule());
        for (int i = 1; i <= 100; i++) {
            System.out.println(ocrTeacher.requestStudentAnswer(i));
        }
    }

}
