package org.example.exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        Scanner in = new Scanner(System.in);
//        System.out.print(" arr size: ");
        int a = in.nextInt();
        float positiveRatio = 0f;
        float negativeRatio = 0f;
        float zeroRatio = 0f;
        arr = new ArrayList<Integer>();

        for (int i = 0; i < a; i++) {
            arr.add(Integer.parseInt(in.next()));
        }

 //       System.out.println("arr = " + arr);

        int positivecnt = 0;
        int negativecnt = 0;
        int zerocnt = 0;

        for (int i = 0; i < a; i++) {
            if (arr.get(i)>0) {
                positivecnt++;
            } else if (arr.get(i)<0) {
                negativecnt++;
            } else {
                zerocnt++;
            }
        }

//        System.out.println("positivecnt = " + positivecnt);
//        System.out.println("negativecnt = " + negativecnt);
//        System.out.println("zerocnt = " + zerocnt);

        positiveRatio = positivecnt / (float)a;
        negativeRatio = negativecnt / (float)a;
        zeroRatio = zerocnt / (float)a;

        System.out.println(String.format("%.5f", positiveRatio));
        System.out.println(String.format("%.5f", negativeRatio));
        System.out.println(String.format("%.5f", zeroRatio));
    }

    public static void main(String[] args) {
        List arr = new ArrayList<Integer>();
        plusMinus(arr);
    }
}
