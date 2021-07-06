package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        text = text.replaceAll("[^0-9-]", " ").trim();
        String[] splitNumbers = text.split("\\s+");
        int[] result = new int[splitNumbers.length];
        for (int i = 0; i < splitNumbers.length; i++) {
            result[i] = Integer.parseInt(splitNumbers[i]) * 2;
        }
        return result;
    }
}
