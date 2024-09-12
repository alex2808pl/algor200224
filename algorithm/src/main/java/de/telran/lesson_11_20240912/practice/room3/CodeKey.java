package de.telran.lesson_11_20240912.practice.room3;

public class CodeKey {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2};
        int[] codes = {2, 3, 4, 5};
        int[] numbers2 = {1, 9, 1, 9};
        int[] codes2 = {0, 0, 0, 0};
        System.out.println(countOborots(numbers, codes));
        System.out.println(countOborots(numbers2, codes2));
    }

    private static int countOborots(int[] number, int[] code) {
        int counter = 0;
        int difference1 = 0;
        int difference2 = 0;
        for (int i = 0; i < number.length; i++) {
            difference1 = Math.abs(number[i] - code[i]);
            difference2 = 10 - Math.abs(number[i] - code[i]);
            if (difference1 < difference2) {
                counter += difference1;
            } else {
                counter += difference2;
            }
        }
        return counter;
    }
}
