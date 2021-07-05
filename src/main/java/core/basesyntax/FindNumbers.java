package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] temp = text.replaceAll("[^\\d\\-]+", " ")
                .trim().split(" ");

        int[] result = new int[temp.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(temp[i]) * 2;
        }

        return result;
    }
}
