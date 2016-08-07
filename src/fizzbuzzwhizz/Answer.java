package fizzbuzzwhizz;

public class Answer {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public static String answer(int i, int[] specialNumberList) {
        StringBuilder answerString = new StringBuilder();

        String numberString = String.valueOf(i);
        if (numberString.contains(String.valueOf(specialNumberList[0]))) {
            return FIZZ;
        }

        answerString.append(i % specialNumberList[0] == 0 ? FIZZ : "");
        answerString.append(i % specialNumberList[1] == 0 ? BUZZ : "");
        answerString.append(i % specialNumberList[2] == 0 ? WHIZZ : "");

        if (answerString.toString().trim().length() < 1) {
            return String.valueOf(i);
        }
        return answerString.toString();
    }
}
