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
    int[] getAllNumbers(String text) {
        String s = text.replaceAll("[^0-9*?:.+\\-^\"_ ]", " ").replaceAll(" +\\s", " ");
        s = s.replaceAll("^\\s*", "");
        String[] words = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String word : words) {
            list.add(Integer.parseInt(word) * 2);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
