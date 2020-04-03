package core.basesyntax;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 92, 18, 26 и 0.</p>
     */
    public static int[] getAllNumbers(String text) {
        return Pattern.compile("-?\\d\\d*")
                .matcher(text).results().map(MatchResult::group)
                .mapToInt(i -> 2 * Integer.parseInt(i)).toArray();
    }
}
