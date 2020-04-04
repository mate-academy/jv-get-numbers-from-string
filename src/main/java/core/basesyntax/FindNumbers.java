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
        String[] stringArray = text.split("[ ]");
        List<String> numbers = new ArrayList<>();
        for (String s : stringArray) {
            numbers.add(s.replaceAll("[^-0-9]", " "));
        }
        List<Integer> list = new ArrayList<Integer>();
        for (String s : numbers) {
            String[] numArray = s.replaceAll("[^-0-9]", "/").split("/");
            for (int i = 0; i < numArray.length; i++) {
                if (!numArray[i].equals("")) {
                    list.add(Integer.parseInt(numArray[i]) * 2);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
