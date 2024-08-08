package de.telran.lesson_6_20240808.practice;

public class Prime {
    public static void main(String[] args) {
        int number = 15;
        System.out.println("Простое ли число (Прямая рекурсия) isPrime "+isPrime(number, true));
        System.out.println("Простое ли число (Косвенная рекурсия) isPrime "+isPrime(number, false));
        System.out.println("Простое ли число isPrimeIterativ "+isPrimeIterativ(number));
    }

    private static boolean isPrime(int number, boolean isLine) {
        if(number == 0 || number == 1) return true;
        boolean isPr = (isLine) ? div(number, 2) : div1(number, 2);
        return isPr;
    }

    // Прямая рекурсия
    private static boolean div(int number, int divider) {
        if(number == divider) return true;

        if(number % divider == 0) {
            System.out.println(number + " % "+divider);
            return false;
        }
        else
            return div(number, divider+1);
    }

    // Косвенная рекурсия
   private static boolean div1(int number, int divider) {
        if(number == divider) return true;

        if(number % divider == 0) {
            System.out.println(number + " % "+divider);
            return false;
        }
        else
            return div2(number, divider+1);
    }

    private static boolean div2(int number, int divider) {
        if(number == divider) return true;

        if(number % divider == 0) {
            System.out.println(number + " % "+divider);
            return false;
        }
        else
            return div1(number, divider+1);
    }


    // Итеративный подход
    private static boolean isPrimeIterativ(int number) {
        for (int divider = 2; divider < number; divider++) {
            if(number % divider == 0)
                return false;
        }
        return true;
    }

}
