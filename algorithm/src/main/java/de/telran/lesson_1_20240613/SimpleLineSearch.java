package de.telran.lesson_1_20240613;

public class SimpleLineSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 4, 5, 6};
        System.out.println("Number 6 exists? - " + getNumber(arr, 6));
        System.out.println("Number 8 exists? - " + getNumber(arr, 8));
    }

    private static boolean getNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
