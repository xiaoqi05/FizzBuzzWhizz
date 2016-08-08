package fizzbuzzwhizz;

import utils.ConsolePrint;
import utils.GenerateNumber;

import java.util.List;
import java.util.Scanner;

import static utils.ParseInputString.checkInputValid;
import static utils.ParseInputString.parseInputStringToNumbers;

public class FizzBuzzWhizz {
    public static final int TOTAL_STUDENT = 100;
    private static boolean RUN = true;

    private void setSpecialNumberList(int[] specialNumberList) {
        this.specialNumberList = specialNumberList;
    }

    private int[] specialNumberList;

    public void startGame() {
        printNoteInfo();
        getInputSpecialNumberList();

        List<Integer> studentNumberList = GenerateNumber.generateNumberList(TOTAL_STUDENT);
        ConsolePrint.consolePrint("the output is :");
        for (Integer number : studentNumberList) {
            ConsolePrint.consolePrint(Answer.answer(number, specialNumberList));
        }
    }

    private void printNoteInfo() {
        ConsolePrint.consolePrint("please input the special number list :");
    }

    private void getInputSpecialNumberList() {

        while (RUN) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (!checkInputValid(input)) {
                ConsolePrint.consolePrint("please input valid number list");
                continue;
            } else {
                RUN = false;
                ConsolePrint.consolePrint("the input special number list is :\n" + input);
                setSpecialNumberList(parseInputStringToNumbers(input));
            }
        }
    }


}
