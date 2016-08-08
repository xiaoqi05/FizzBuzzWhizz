package utils;

import java.util.ArrayList;
import java.util.List;

public class GenerateNumber {
    public static List<Integer> generateNumberList(int total) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= total; i++) {
            list.add(i);
        }
        return list;
    }
}
