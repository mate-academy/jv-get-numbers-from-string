package core.basesyntax;

public class FindNumbers {
    public int[] getAllNumbers(String text) {
        String[] strOfNumbers = text
                .replaceAll("[^\\d- ]+", " ")
                .trim()
                .split("[\\s]+");
        int[] numbers = new int[strOfNumbers.length];
        for (int i = 0; i < strOfNumbers.length; i++) {
            if (!strOfNumbers[i].equals("")) {
                numbers[i] = Integer.parseInt(strOfNumbers[i]) * 2;
            }
        }
        return numbers;
    }
}
