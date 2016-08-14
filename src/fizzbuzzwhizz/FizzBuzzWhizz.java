package fizzbuzzwhizz;

import utils.ConsolePrint;
import utils.GenerateNumber;

import java.util.List;

public class FizzBuzzWhizz {

    private static final int TOTAL_STUDENT = 100;

    public void startGame() {

        ConsolePrint.consolePrint("please input the special number list :");
        Teacher teacher = new Teacher();
        teacher.defineSpecialNumber();
        List<Integer> studentNumberList = GenerateNumber.generateNumberList(TOTAL_STUDENT);
        ConsolePrint.consolePrint("the output is :");
        for (Integer number : studentNumberList) {
            ConsolePrint.consolePrint(Student.answer(number, teacher.getSpecialNumbers()));
        }
    }


}
