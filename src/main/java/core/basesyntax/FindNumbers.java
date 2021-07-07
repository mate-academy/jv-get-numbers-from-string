package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] stringArray = text.replaceAll("([^\\d\\s-])", " ").trim().split("\\s{1,}");

        int[] result = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            result[i] = Integer.parseInt(stringArray[i]) * 2;
        }
        return result;
    }
}
