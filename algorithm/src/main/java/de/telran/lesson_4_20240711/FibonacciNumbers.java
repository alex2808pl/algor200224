package de.telran.lesson_4_20240711;

import java.util.Arrays;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int num = 10; //(1,1,2,3,5,8)
        System.out.println("Recurs = "+ fibonacciRecursion(num));

        int[] arr = new int[num + 1];
        for(int i = 0; i <= num; i++) {
            if(i<2) arr[i] =1;
            else arr[i] = -1;
        }
        System.out.println(fibonacciUpgrade(num, arr));
        System.out.println(Arrays.toString(arr));
    }

    private static int fibonacciRecursion(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    private static int fibonacciUpgrade(int n, int[] arr) {
        if (n < 2) {
            return 1;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        arr[n] = fibonacciUpgrade(n - 1, arr) + fibonacciUpgrade(n - 2, arr);
        return arr[n];
    }
}
