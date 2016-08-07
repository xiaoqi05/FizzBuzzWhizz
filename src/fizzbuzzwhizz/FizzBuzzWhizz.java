package fizzbuzzwhizz;

import utils.ConsolePrint;
import utils.GenerateNumber;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FizzBuzzWhizz {
    public static final int TOTAL_STUDENT = 100;

    private void setSpecialNumberList(int[] specialNumberList) {
        this.specialNumberList = specialNumberList;
    }

    private int[] specialNumberList;

    public void startGame() {
        printNoteInfo();
        getInputSpecialNumberList();

        List<Integer> studentNumberList = GenerateNumber.generateNumberList(TOTAL_STUDENT);
        for (Integer number : studentNumberList) {
            System.out.println(Answer.answer(number, specialNumberList));
        }
    }

    private void printNoteInfo() {
        ConsolePrint.consolePrint("please input the special number list :");
    }

    private void getInputSpecialNumberList() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (!checkInputNumberValid(input)) {
            ConsolePrint.consolePrint("please input valid number list");
        }

        String[] numberList = input.split(",");
        int[] specialNumbers = new int[3];
        for (int i = 0; i < numberList.length; i++) {
            specialNumbers[i] = Integer.parseInt(numberList[i]);
        }
        setSpecialNumberList(specialNumbers);
        ConsolePrint.consolePrint(input);
    }

    private boolean checkInputNumberValid(String input) {
        boolean result = true;
        String[] numberList = input.split(",");
        if (numberList.length != 3) {
            result = false;
        }
        for (String number : numberList) {
            if (!isNumeric(number)) {
                result = false;
            }
        }
        return result;
    }

    public boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }


}
