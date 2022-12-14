package org.example.exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void birthdayCakeCandles(List<Integer> list) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        list.sort(Comparator.reverseOrder());

        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(0) == list.get(i)) {
                cnt++;
            }
        }

        System.out.println("cnt = " + cnt);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        birthdayCakeCandles(list);
    }
}
