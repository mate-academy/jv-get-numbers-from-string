package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        text = text.replaceAll("[^0-9\\-]", " ").trim();
        String[] splitedText = text.split("\\s+");
        int[] result = new int[splitedText.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(splitedText[i]) * 2;
        }
        return result;
    }
}
