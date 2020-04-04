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
    public int[] getAllNumbers(String text) {
        String[] temp = text.replaceAll("[^ 0-9-]", " ").split(" ");
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].equals("") && !temp[i].equals(" ")) {
                count++;
            }
        }
        int[] fin = new int[count];
        int ind = 0;
        for (String s : temp) {
            if (!s.equals("") && !s.equals(" ")) {
                fin[ind] = Integer.parseInt(s) * 2;
                ind++;
            }
        }
        return fin;
    }
}
