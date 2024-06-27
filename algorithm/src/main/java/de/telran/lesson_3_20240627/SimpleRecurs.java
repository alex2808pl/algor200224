package de.telran.lesson_3_20240627;

public class SimpleRecurs {
    public static void main(String[] args) {
        int sum = sumRecurs(5); // Рекурсивный подход (прямая рекурсия)
        System.out.println("Rec: sum = "+sum);

        sum = sumIterat(5); //Итеррационный подход
        System.out.println("Iter: sum = "+sum);

        sum = sumRecursCosv(5); //Косвенная рекурсия
        System.out.println("RecCosv: sum = "+sum);

    }

    static int sumRecurs(int n) {
        System.out.println("sumRecurs("+n+")");
        if(n==1) return 1; //базовое условие
        int res = n + sumRecurs(n-1);
        System.out.println("Rec: res="+res+", n="+n);
        return res;
    }

    // ---- Косвенная рекурсия
    static int sumRecursCosv(int n) {
        System.out.println("sumRecursCosv("+n+")");
        if(n==1) return 1; //базовое условие
        int res = n + method(n-1);
        System.out.println("Rec: res="+res+", n="+n);
        return res;
    }

    static int method(int m) {
        System.out.println("method("+m+")");
        return sumRecursCosv(m);
    }
    // ----

    static int sumIterat(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
            System.out.println("Iter: res="+res+", n="+i);
        }
        return res;
    }
}
