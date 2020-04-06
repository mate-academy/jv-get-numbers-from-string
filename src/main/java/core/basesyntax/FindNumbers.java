package core.basesyntax;

public class FindNumbers {
    public int[] getAllNumbers(String text) {
        String [] nubers = text.replaceAll("[^\\d\\-]+", " ")
                .trim().split(" ");
        int[] result = new int[nubers.length];
        for (int i = 0; i < nubers.length; i++) {
            result[i] = Integer.parseInt(nubers[i]) * 2;
        }
        return result;
    }
}
