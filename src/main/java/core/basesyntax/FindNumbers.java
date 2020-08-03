package core.basesyntax;

import java.util.ArrayList;

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

        String[] numbersString = text.replaceAll("[^-?[1-9]\\d*|0]", ".")
                .split("\\.");
        ArrayList<Integer> numbersDoubled = new ArrayList<>();
        for (String string : numbersString) {
            if (!string.equals("")) {
                numbersDoubled.add(Integer.parseInt(string) * 2);
            }
        }
        int[] result = new int[numbersDoubled.size()];
        for (int i = 0; i < numbersDoubled.size(); i++) {
            result[i] = numbersDoubled.get(i);
        }
        return result;
    }
}
