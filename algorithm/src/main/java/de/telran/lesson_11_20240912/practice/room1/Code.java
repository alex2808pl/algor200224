package de.telran.lesson_11_20240912.practice.room1;

import java.util.Arrays;

public class Code {
    public static void main(String[] args) {
        int[] currentCode = {1, 9, 1, 9};
        int[] unlockCode = {0, 0, 0, 0};

        String [] res = greedyAlg(currentCode, unlockCode);

        System.out.println("Нужное количество обротов: " + Arrays.toString(res));
    }

    public static String[] greedyAlg(int[] currentCode, int[] unlockCode) {
        String[] result = new String[currentCode.length];
        int count =0;

        for (int i = 0; i < currentCode.length; i++) {
            int forward = (unlockCode[i] - currentCode[i] + 10) % 10;
            int backward = (currentCode[i] - unlockCode[i] + 10) % 10;

            if(forward <= backward){
                result[i] = forward + " вперед";
                count+= forward;
            } else {
                result[i] = backward+ " назад";
                count+= backward;
            }
        }
        System.out.println("Вы откроете это тзамок за " + count + " вращений");
        return result;
    }
}
