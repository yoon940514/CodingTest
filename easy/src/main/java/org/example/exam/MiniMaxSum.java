package org.example.exam;

import java.util.*;

public class MiniMaxSum {




    public static void miniMaxSum(List<Integer> list) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < size; i++) {

            int a = in.nextInt();
            list.add(a);
            list2.add(a);
        }

        list.sort(Comparator.naturalOrder());
        list2.sort(Comparator.reverseOrder());


        list.remove(0);
        list2.remove(0);


        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
            sum2 = sum2 + list2.get(i);
        }

        System.out.println("mini = " + sum);
        System.out.println("max = " + sum2);
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        miniMaxSum(list);





    }
}
