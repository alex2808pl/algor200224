package de.telran.lesson_3_20240627;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Rec = "+funRecursion(5, 0));

        System.out.println(" -- 2 зал ---");
        System.out.println(funIteration21(5,0));
        System.out.println(funIteration22(5,0));

        System.out.println(" -- Основной зал ---");
        System.out.println(funcIterat(5,0));

        System.out.println(" -- 3 зал ---");
        System.out.println(funIteration(5,0));

        System.out.println(" -- 1 зал ---");
        System.out.println(funIteration1(5,0));

        System.out.println(" -- Учитель ---");
        System.out.println(funIterationMy(5,0));
    }

    private static int funRecursion(int x, int y) {
        if (x == 0) {
            return y;
        } else {
            int res = funRecursion(x - 1, x + y);
            System.out.println("res = " + res + "; x = " + x + "; y = " + y);
            return res;
        }
    }

    // 2 зал
    static int funIteration21(int x, int y) {
        for (; x != 0; x--) {
            y = x + y;
        }
        return y;
    }
    static int funIteration22(int x, int y) {
        while (x != 0) {
            y = x + y;
            x = x - 1;
        }
        return y;
    }

    // Основной
    private static int funcIterat(int x,int y){
        for (; x > 0; x--) {
            y = x+y;
        }
        return y;
    }

    // 3й зал
    private static int funIteration(int x, int y){
        for (int i = x; i > 0; i--) {
            y = i + y;
        }
        return y;
    }

    // 1й зал
    private static int funIteration1(int x, int y) {
        while (x != 0) {
            int tempX = x - 1;
            int tempY = x + y;
            System.out.println("res = " + tempY + "; x = " + x + "; y = " + y);
            x = tempX;
            y = tempY;
        }
        return y;
    }

    // Вариант учителя
    private static int funIterationMy(int x, int y) {
        for (int i = 0; i < x; i++) {
            System.out.println("x = " + (x - i) +" y = " + y);
            y = (x - i) + y;
        }
        return y;
    }
}
