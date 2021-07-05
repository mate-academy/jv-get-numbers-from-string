package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] arraysOfStr = text.replaceAll("[^\\d-]+", " ").trim().split(" ");
        int[] result = new int[arraysOfStr.length];
        for (int i = 0; i < arraysOfStr.length; i++) {
            result[i] = Integer.parseInt(arraysOfStr[i]) * 2;
        }
        return result;
    }
}
