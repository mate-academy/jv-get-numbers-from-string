package core.basesyntax;

public class FindNumbers {
    public int[] getAllNumbers(String text) {
        String[] numbers = text.replaceAll("[^0-9+-]"," ").trim().split(" ");
        int quantity = 0;
        for (String number:numbers) {
            if(number.length()>0){
                quantity++;
            }
        }
        int[] answer = new int[quantity];
        quantity = 0;
        for (String number:numbers) {
            if(number.length()>0){
                answer[quantity] = 2*Integer.parseInt(number);
                quantity++;
            }
        }
        return answer;
    }
}
