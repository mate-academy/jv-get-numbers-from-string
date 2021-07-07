package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        List<Integer> list = new ArrayList<Integer>();
        String[] stringArray = text.replaceAll("[^-0-9]+", " ").trim().split(" ");
        for (String s : stringArray) {
            list.add(Integer.parseInt(s) * 2);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
