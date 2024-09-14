public class ThreeSmallMethods {

    public boolean isYoung(int age) {
        return age <= 30;
    }

    public boolean hasLegalGenderManInSweden(String personalNumber){

    }

    public int firstTwoDigitInteger(int[] numbers) {
        for (int number : numbers) {
            if (number >= 10 && number < 100) {
                return number;
            }
        }
        return -1;
    }
}
