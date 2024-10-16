package de.telran.lesson_14_20241010.ht;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0, 1};
        int[] arr2 = {2, 4, 5, 0, 1, 1};
        System.out.println("Эти два массива идентичны: " + checkEqualsArray(arr1, arr2));
        System.out.println("Эти два массива идентичны (Map): " + checkEqualsArrayMap(arr1, arr2));
    }

    public static boolean checkEqualsArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkEqualsArrayMap(int[] arr1, int[] arr2) {
        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;

        // If lengths of arrays are not equal
        if (lengthArr1 != lengthArr2) {
            return false;
        }
        // Store arr1[] elements and their counts in hash map
        Map<Integer, Integer> map = new HashMap<>();
        int count;
        for (int idx : arr1) {
            if (map.get(idx) == null)
                map.put(idx, 1);
            else {
                count = map.get(idx);
                count++;
                map.put(idx, count);
            }
        }

        for (int idx = 0; idx < lengthArr2; idx++) {

            // If there is an element in arr2[], but
            // not in arr1[]
            if (!map.containsKey(arr2[idx]))
                return false;

            // If an element of arr2[] appears more
            // times than it appears in arr1[]
            if (map.get(arr2[idx]) == 0)
                return false;

            count = map.get(arr2[idx]);
            --count;
            map.put(arr2[idx], count);
        }
        return true;
    }

}
