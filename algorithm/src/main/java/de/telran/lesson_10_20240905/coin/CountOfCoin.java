package de.telran.lesson_10_20240905.coin;

import java.util.ArrayList;
import java.util.List;

public class CountOfCoin {
    public static void main(String[] args) {
        //int[] coins = {1,2,5,10,50};
        int[] coins = {1,4,6}; // жадный алгоритм отработает не оптимально с точки зрения выдачи монет
        int sum = 68;
        List<Integer> res = getChange(sum, coins);
        System.out.println(res);

    }

    private static List<Integer> getChange(int sum, int[] coins) {
        List<Integer> result = new ArrayList<>();
        for (int i = coins.length - 1; i >= 0; i--) { // цикл выбора монет
            while (sum >= coins[i]) { // количество монет одного номинала
                sum -= coins[i];
                result.add(coins[i]);
            }
        }
        return result;
    }


}
