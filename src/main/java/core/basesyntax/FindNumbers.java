package core.basesyntax;

public class FindNumbers {

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 92, 18, 26 и 0.</p>
     */

    private static final String REGEX = "[^\\-\\d]+";

    public int[] getAllNumbers(String text) {
        String replaced = text.replaceAll(REGEX, "_");
        if (replaced.charAt(0) == '_') {
            replaced = replaced.substring(1);
        }
        String[] answerString = replaced.split("_");
        int[] answer = new int[answerString.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(answerString[i]) * 2;
        }
        return answer;
    }
}
