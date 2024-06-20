package de.telran.lesson_2_20240620;

public class Task2 {
    public static void main(String[] args) {
        bubleFor(9);
    }

    static void bubleFor(int n) {
        for (int i = 0; i < n/3; i++) { //const = 3 times = n/3
            for (int j = 0; j <= n; j = j + 4) { // const = 4  times = n
                System.out.println("Hello ["+i+"] ["+j+"]"); //+1
            }
        }
    }
}

// (1 + 2n/3) * (1+ 3n +1n) = (1+ 4n) + (2n/3+ 8n^2/3) =  O(n^2)



//сравнения («больше», «меньше», «равно»);
//присваивания;
//выделение памяти.
