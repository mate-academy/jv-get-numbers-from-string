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
        String[] textWithoutLetters = text.replaceAll("[^-\\d. ]"," ").split(" ");
        ArrayList<Integer> answerList = new ArrayList<>();
        for (String textNumber : textWithoutLetters) {
            if (textNumber.isEmpty()) {
                continue;
            }
            answerList.add(Integer.parseInt(textNumber) * 2);
        }
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
