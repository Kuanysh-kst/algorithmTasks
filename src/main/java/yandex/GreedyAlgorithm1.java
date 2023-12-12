package yandex;

import java.util.ArrayList;
import java.util.List;

public class GreedyAlgorithm1 {
    public static void main(String[] args) {
        int coin = 5;
        greedySearch(coin, new int[]{1, 5, 10});
    }

    public static void greedySearch(int money, int[] coins) {
        int coinLength = coins.length - 1;
        List<List<Integer>> lists = new ArrayList<>();

        print(lists);
    }

    private static void print(List<List<Integer>> lists) {
        System.out.println(lists.size());
        for(List<Integer> list : lists) {
            System.out.print(list.size() + " ");
            for(int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
