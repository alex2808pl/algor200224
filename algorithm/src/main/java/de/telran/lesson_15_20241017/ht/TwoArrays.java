package de.telran.lesson_15_20241017.ht;

public class TwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 10, 29};
        int[] array2 = {8, 20, 29, 30};

        findPairSumTwoPoint(array1, array2);

    }

    public static void findPairSumTwoPoint(int[] array1, int[] array2) {
        int firstElement = array1[0];
        int secondElement = array2[0];
        int minModul = Math.abs(firstElement - secondElement);

        int i = 0;
        int j = 0;

        while(i < array1.length && j < array2.length) {
            int tempModul = Math.abs(array1[i] - array2[j]);

            if(array1[i] == array2[j]) { // два равные элемента дадут минимально возможную разницу
                minModul = tempModul;
                firstElement = array1[i];
                secondElement = array2[j];
                break; // дальше проверять не нужно
            }

            if(minModul > tempModul) {
                minModul = tempModul;
                firstElement = array1[i];
                secondElement = array2[j];
            }

            if(array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
         }

        System.out.println(firstElement+" - " +secondElement+" = |"+(firstElement-secondElement)+"| => "+minModul );

    }
}

//Для двух заданных отсортированных в возрастающем порядке целочисленных массивов A и B длин n и m соответственно,
//найти пару самых близких между собой по значению элементов. Более формально: найти такие элементы A[i] и B[j],
//что их модуль разности минимален по сравнению с другими парами элементов из этих массивов.
//
//Пример. Для заданных массивов {1, 2, 10} и {8, 20, 30} ответом будет пара чисел 10 и 8.
