package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] tempString = text.replaceAll("[a-z+A-Z+^!]", " ").trim().split("\\s+");
        int[] result = new int[tempString.length];
        for (int i = 0; i < result.length; i++) {
            result[i] += Integer.parseInt(tempString[i]) * 2;
        }
        return result;
    }
}
