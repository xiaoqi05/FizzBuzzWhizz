package fizzbuzzwhizz;

import utils.ConsolePrint;

import java.util.Scanner;

import static utils.ParseInputString.checkInputValid;
import static utils.ParseInputString.parseInputStringToNumbers;

public class Teacher {
    private static boolean RUN = true;
    private int[] specialNumbers;

    public int[] getSpecialNumbers() {
        return specialNumbers;
    }

    public void setSpecialNumbers(int[] specialNumbers) {
        this.specialNumbers = specialNumbers;
    }


    public void defineSpecialNumber() {
        while (RUN) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (!checkInputValid(input)) {
                ConsolePrint.consolePrint("please input valid number list");
                continue;
            } else {
                RUN = false;
                ConsolePrint.consolePrint("the input special number list is :\n" + input);
                setSpecialNumbers(parseInputStringToNumbers(input));
            }
        }
    }

}
