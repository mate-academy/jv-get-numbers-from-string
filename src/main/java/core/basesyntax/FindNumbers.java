package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String str = text.replaceAll("[^-?\\d+$]", " ").trim();
        String[] resStrings = str.split("\\s+");
        int[] result = new int[resStrings.length];

        for (int i = 0; i < resStrings.length; i++) {
            result[i] = Integer.parseInt(resStrings[i]);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] *= 2;
        }

        return result;
    }
}
