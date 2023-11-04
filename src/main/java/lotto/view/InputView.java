package lotto.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import lotto.message.ErrorMessage;
import lotto.message.InputMessage;

public class InputView {

    public static int getPrice() {
        InputMessage.PRICE_PROMPT.print();
        String input = readLine();
        if (!isNumbericValue(input)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER_FORMAT.getMessage());
        }
        int price = Integer.parseInt(input);
        if (price < 0) {
            throw new IllegalArgumentException(ErrorMessage.NEGATIVE_PRICE_VALUE.getMessage());
        }
        return price;
    }

    private static boolean isNumbericValue(String input) {
        char[] data = input.toCharArray();
        int index = 0;

        if (data[index] == '-') {
            index++;
        }
        for (int i = index; i < data.length; i++) {
            if (!Character.isDigit(data[i])) {
                return false;
            }
        }
        return true;
    }
}
