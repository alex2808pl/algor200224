package de.telran.lesson_5_20240801.practice;

public class InversionCount {
    public static void main(String[] args) {
        int arr[] = {8, 4, 2, 1};
        System.out.println("Count inv = "+getInvCount(arr));

        int arr1[] = {3, 1, 2};
        System.out.println("Count inv = "+getInvCount(arr1));

        int arr2[] = {1, 2, 4, 8};
        System.out.println("Count inv = "+getInvCount(arr2));

        int arr3[] = {10, 9, 8, 4, 2, 1};
        System.out.println("Count inv = "+getInvCount(arr3));
    }

    private static int getInvCount(int[] arr) {
        int length = arr.length;
        int count = 0;
        for(int i = 0; i < length-1; i++) { //n
            for(int j = i + 1; j < length; j++) { //n/2
                if(arr[i] > arr[j]) {
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    count++;
                }
            }
        }
        return count;
    }
}

//Count Inversions in an array
//
//Счетчик инверсии для массива указывает, насколько далек (или близок) массив от сортировки.
// Если массив уже отсортирован, то счетчик инверсии равен 0, а если массив отсортирован в
// обратном порядке, то счетчик инверсии будет максимальным.
//
//        Пример:
//Ввод: arr[] = {8, 4, 2, 1}
//Вывод: 6
//Объяснение: Данный массив имеет шесть инверсий:
//        (8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1).
//
//Ввод: arr[] = {3, 1, 2}
//Вывод: 2
//Объяснение: Данный массив имеет две инверсии:
//        (3, 1), (3, 2)


