package core.basesyntax;

public class FindNumbers {
    public int[] getAllNumbers(String text) {
        String[] maxText = text.replaceAll("([^0-9|-])+"," ").trim()
                .split(" ");
        int[] result = new int[maxText.length];
        for (int i = 0; i < maxText.length; i++) {
            result[i] = Integer.parseInt(maxText[i]) * 2;
        }
        return result;
    }
}
