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
    public static int[] getAllNumbers(String text) {
        text = text.replaceAll("[^\\d-]", " ");
        String[] numbers = text.split(" ");
        int count = 0;
        for (String number : numbers) {
            if (number.length() != 0) {
                ++count;
            }
        }
        int[] result = new int[count];
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length() != 0) {
                result[count] = Integer.parseInt(numbers[i]) * 2;
                ++count;
            }
        }
        return result;
    }
}
