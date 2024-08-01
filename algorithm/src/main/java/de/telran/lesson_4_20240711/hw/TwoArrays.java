package de.telran.lesson_4_20240711.hw;

import java.util.PriorityQueue;

public class TwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {100,112,256,349,770};
        int[] arr2 = {72,86,113,119,265,445,892};
        int k = 7;

        System.out.println(getElementTwoSortedArrays(arr1, arr2, k));

    }
    public static int getElementTwoSortedArrays(int[] arr1, int[] arr2, int index) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // Pushing elements for array arr1 to min-heap
        for (int element : arr1) {
            priorityQueue.offer(element);
        }
        // Pushing elements for array arr2 to min-heap
        for (int element : arr2) {
            priorityQueue.offer(element);
        }
        // Popping-out K-1 elements
        while (index-- > 1) {
            priorityQueue.remove();
        }
        return priorityQueue.peek();
    }
}
