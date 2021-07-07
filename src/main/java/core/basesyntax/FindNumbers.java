package core.basesyntax;

public class FindNumbers {

    public int[] getAllNumbers(String text) {
        String[] numberArray = text.replaceAll("[^0-9\\-]"," ")
                .replaceAll("\\s+"," ").trim().split(" ");
        int[] resultMultiplying = new int[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            resultMultiplying[i] = Integer.parseInt(numberArray[i]) * 2;
        }
        return resultMultiplying;
    }
}
