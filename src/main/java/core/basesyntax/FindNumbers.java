package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] temp = text.replaceAll("[^-0-9]+", " ").trim().split(" ");
        int[] numbers = new int[temp.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(temp[i]) * 2;
        }
        return numbers;
    }
}
