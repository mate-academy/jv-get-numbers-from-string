package core.basesyntax;

public class FindNumbers {
    public int[] getAllNumbers(String text) {
        String[] numbers = text.replaceAll("[^0-9+-]", " ").trim().split("\\s+");
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = 2 * Integer.parseInt(numbers[i]);
        }
        return answer;
    }
}
