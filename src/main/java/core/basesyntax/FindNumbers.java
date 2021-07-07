package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] resultString = text.replaceAll("[^-0-9]+", " ").trim().split(" ");
        int [] result = new int[resultString.length];
        for (int i = 0; i < resultString.length; i++) {
            result[i] = Integer.parseInt(resultString[i]) * 2;
        }
        return result;
    }
}
