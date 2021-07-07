package core.basesyntax;

import java.util.ArrayList;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] words = text.replaceAll("[^0-9 + -]+", " ").split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i];
            if (words[i].isEmpty()) {
                continue;
            }
            arrayList.add(Integer.parseInt(words[i]) * 2);
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
