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
        String[] tmp = text.replaceAll("[^0-9-]", " ").trim().split("\\s+");
        int[] result = new int[tmp.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(tmp[i]) * 2;
        }

        return result;
    }
}
