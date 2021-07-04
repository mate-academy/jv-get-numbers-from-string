package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] res = text.replaceAll("[^0-9&-]+", " ").trim().split(" ");
        int[] result = new int[res.length];
        for (int i = 0; i < res.length; i++) {
            result[i] = Integer.parseInt(res[i]) * 2;
        }
        return result;
    }
}
