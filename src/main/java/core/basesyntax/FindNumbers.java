package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

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
        String[] numbersString = text.split("([^-0-9]+)");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbersString.length; i++) {
            if (!numbersString[i].equals("")) {
                list.add(Integer.parseInt(numbersString[i]) * 2);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
