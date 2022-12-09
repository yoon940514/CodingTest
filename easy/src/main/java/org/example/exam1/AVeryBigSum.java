package org.example.exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {

    public static long aVeryBigSum(List<Long> arr1) {
        long sum = 0;
        for (int i = 0; i < arr1.size(); i++) {
            sum = sum + arr1.get(i);
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Long> arr1 = new ArrayList<Long>();

        int inputCount=in.nextInt();

        if (inputCount <= 10 && inputCount >= 1) {
            for (int i=0; i<inputCount; i++) {
                arr1.add(in.nextLong());
            }

            System.out.println("arr1 = " + arr1);

            System.out.println("배열의 총합: " + aVeryBigSum(arr1));

            
        } else {
            System.out.println("배열 개수가 1미만 10이상입니다. 오류입니다.");
        }



    }
}
