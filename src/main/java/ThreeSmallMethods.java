public class ThreeSmallMethods {

    public boolean isYoung(int age) {
        return age <= 30;
    }

    public boolean hasLegalGenderManInSweden(String personalNumber){
        char secondToLastDigit = personalNumber.charAt(personalNumber.length() - 2);
        return Character.getNumericValue(secondToLastDigit) % 2 != 0;
    }

    public int firstTwoDigitInteger(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number>=10 && number<100) {
                return number;
            }
        }
        return -1;
    }
}
