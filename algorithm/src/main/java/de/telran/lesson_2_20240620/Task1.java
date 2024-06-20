package de.telran.lesson_2_20240620;

public class Task1 {
    public static void main(String[] args) {
        fork(10);
    }

    public static void fork(int n) {
        if(n < 5) { //+1
            System.out.println("number < 5"); //+1
        }
        else {
            for (int i = 0; i < n; i++) {  // const = 3  times = n
                System.out.print(i+" "); //+1
            }
        }
    }
}
// 2 или 1+ 2n + 1n = 1+3n = O(3n) = O(n)

//сравнения («больше», «меньше», «равно»);
//присваивания;
//выделение памяти.

