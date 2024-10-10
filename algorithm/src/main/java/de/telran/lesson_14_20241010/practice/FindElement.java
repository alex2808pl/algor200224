package de.telran.lesson_14_20241010.practice;

import java.util.HashMap;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int k = 3; // количество повторений
        System.out.println("firstElementNative -> "+firstElementNative(arr, k));
        System.out.println("firstElementMap -> "+firstElementMap(arr, k));
    }

    public static int firstElementNative(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            if(count == k) { // условия правильности поиска
                return arr[i];
            }
        }
        return -1;
    }

    //{1, 7, 4, 3, 4, 8, 7};
    public static int firstElementMap(int[] arr, int k) {
        // unordered map to count occurrences of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (map.get(arr[i]) != null) {
                count = map.get(arr[i]);
            }
            map.put(arr[i], count + 1);
        }
        for (int i = 0; i < arr.length; i++) { // if count of element == k ,then it is the required first element
            if (map.get(arr[i]) == k) {
                return arr[i];
            }
        }
        return -1;
    }
}
