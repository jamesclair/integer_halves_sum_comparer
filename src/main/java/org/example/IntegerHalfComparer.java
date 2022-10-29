package org.example;

public class IntegerHalfComparer {

    // even num of digits
    private int number;
    private int sumFirstHalf = 0;
    private int sumSecondHalf = 0;

    IntegerHalfComparer(int number) {
        if (isValidLength(number))
            this.number = number;
        splitNumberInHalf();
    }

    private void splitNumberInHalf() {
        int div = (int) Math.pow(10, String.valueOf(number).length() / 2);
        int firstHalfNum = number / div;
        int secondHalfNum = number % div;
        for (int num: String.valueOf(firstHalfNum).toCharArray())
            sumFirstHalf += Character.getNumericValue(num);
        for (int num: String.valueOf(secondHalfNum).toCharArray())
            sumSecondHalf += Character.getNumericValue(num);
    }

    public boolean isHalvesEqual() {
        if (sumFirstHalf == sumSecondHalf)
            return true;
        return false;
    }


    private boolean isValidLength(int n) throws RuntimeException {
        if (String.valueOf(n).length() % 2 != 0)
            throw new RuntimeException("Ticket number digit length is not even!  Supplied number: " + n);
        return true;
    }

}
