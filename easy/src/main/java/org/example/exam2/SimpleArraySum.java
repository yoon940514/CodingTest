package org.example.exam2;

import java.util.List;

public class SimpleArraySum {
    public static int simpleArraySumMethod(List<Integer> ar) {
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum = sum + ar.get(i);
        }
        return sum;
    }
}
