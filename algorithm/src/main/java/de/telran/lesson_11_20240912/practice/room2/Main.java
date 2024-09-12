package de.telran.lesson_11_20240912.practice.room2;

public class Main {
    public static void main(String[] args) {
//        int[] lock = {2,3,4,5};
//        int[] activateCode = {5,4,3,2};

        int[] lock = {1,9,1,9};
        int[] activateCode = {0,0,0,0};

        int counter = 0; // количество оборотов

        for (int i = 0; i < lock.length; i++) {
            int temp = lock[i] - activateCode[i];

            int up = temp < 0 ? temp + 10 : temp;
            int down = -temp < 0 ? -temp + 10 : -temp;
            counter += up > down ? down : up;
        }
        System.out.println(counter);
    }
}
