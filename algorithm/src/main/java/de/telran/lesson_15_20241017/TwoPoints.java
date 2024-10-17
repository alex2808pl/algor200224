package de.telran.lesson_15_20241017;

public class TwoPoints {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6}; //отсортированный массив
        int sum = 6; // сумма 2-х элементов
        findPairSumTwoPoint(arr, sum);
    }

    private static void findPairSumTwoPoint(int[] arr, int sum) {
        int i = 0; // первый указатель
        int j = arr.length - 1;  // второй указатель

        while(i < j) {
            int curSum = arr[i] + arr[j];
            if(curSum == sum) {
                System.out.println("Нашли пару "+arr[i] +" <=> "+ arr[j]+", которая дает сумму = "+sum);
                return;
            } else if(curSum < sum) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("Не нашли пары, которая дает сумму = "+sum);
      }
}
