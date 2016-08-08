package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseInputString {

    public static boolean checkInputValid(String input) {
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

    private static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[1-9]");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    public static int[] parseInputStringToNumbers(String input) {
        String[] numberList = input.split(",");
        int[] specialNumbers = new int[3];
        for (int i = 0; i < numberList.length; i++) {
            specialNumbers[i] = Integer.parseInt(numberList[i]);
        }
        return specialNumbers;
    }

}
