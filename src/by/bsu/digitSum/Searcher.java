package by.bsu.digitSum;

/**
 * Created by anyab on 25.02.2017.
 */
public class Searcher {

    public static int findAmountOfNumbersWithGivenDigitSum(int sumOfDigits, int amountOfDigits) {
        int result = 0;
        if (sumOfDigits < 0 || (sumOfDigits >= 10 && amountOfDigits == 1)) {
            return 0;
        }
        if (amountOfDigits == 1 || sumOfDigits == 0) {
            return 1;
        } else {
            for(int i = 0; i < 10; i++){
                result += findAmountOfNumbersWithGivenDigitSum(sumOfDigits - i, amountOfDigits - 1);
            }
        }
        return result;
    }
}
