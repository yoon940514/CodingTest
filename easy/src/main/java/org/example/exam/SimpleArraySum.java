package org.example.exam;

import java.util.*;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        int indexValue;
        List<Integer> ar2 = new ArrayList<Integer>();
        size = in.nextInt();
        for (int i = 0; i < size; i++) {
            indexValue = in.nextInt();
            ar2.add(indexValue);
        }

        int sum = 0;
        for (int i = 0; i < ar2.size(); i++) {
            sum = sum + ar2.get(i);
        }

        System.out.println("sum = " + sum);
    }
}
