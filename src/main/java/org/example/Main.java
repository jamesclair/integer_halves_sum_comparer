package org.example;

public class Main {
    public static void main(String[] args) {
            int n = 1230;
            IntegerHalfComparer comparer = new IntegerHalfComparer(n);
            System.out.println("Result: " + comparer.isHalvesEqual());

    }
}