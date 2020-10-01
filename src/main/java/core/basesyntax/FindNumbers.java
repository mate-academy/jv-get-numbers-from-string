package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] startArray = text.replaceAll("[^-0-9]+", " ").trim().split(" ");
        int[] result = new int [startArray.length];
        for (int i = 0;i < startArray.length; i++) {
            result[i] = Integer.parseInt(startArray[i]) * 2;
        }
        return result;
    }
}
