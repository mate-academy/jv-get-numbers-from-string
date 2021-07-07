package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] stringsArray = text.replaceAll("[^\\d\\s-]", " ").trim().split("\\s+");
        int[] result = new int[stringsArray.length];
        for (int i = 0; i < stringsArray.length; i++) {
            result[i] = Integer.valueOf(stringsArray[i]) * 2;
        }
        return result;
    }
}
