package org.example.exam;

import java.util.Scanner;

public class solveMeFirst {
    static int sovleMeFirst (int a, int b) {


        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = sovleMeFirst(a, b);
        System.out.println(sum);
    }
}
