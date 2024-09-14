public class ThreeSmallMethods {

    public boolean isYoung(int age) {
        return age <= 30;
    }

    public boolean hasLegalGenderManInSweden(String personalNumber){
        if (personalNumber.length() == 10) {
            char secondToLastDigit = personalNumber.charAt(personalNumber.length() - 2);
            return Character.getNumericValue(secondToLastDigit) % 2 != 0;
        } else{
            return false;
        }
    }

    public int firstTwoDigitInteger(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (Math.abs(number) >= 10 && Math.abs(number) < 100) {
                return number;
            }
        }
        return -1;
    }
}
