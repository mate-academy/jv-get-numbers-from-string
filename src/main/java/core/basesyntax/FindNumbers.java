package core.basesyntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 92, 18, 26 и 0.</p>
     */
    public int[] getAllNumbers(String text) {
        ArrayList<String> removeEmptyBox = new ArrayList<>();
        Collections.addAll(removeEmptyBox, text.replaceAll("[^-\\d]", " ").split(" "));
        removeEmptyBox.removeAll(Collections.singletonList(""));
        int[] result = new int[removeEmptyBox.size()];
        int index = 0;
        for (String value : removeEmptyBox) {
            result[index] = Integer.parseInt(value) * 2;
            index++;
        }
        return result;
    }
}
