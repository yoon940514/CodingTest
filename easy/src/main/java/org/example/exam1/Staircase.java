package org.example.exam1;

import java.util.Arrays;
import java.util.Scanner;

public class Staircase {

    public static void staircase(int n) {
        String a = "";
        String b = "";
        for (int j = 0; j < ; j++) {


            for (int i=n-1; i>=0; i--) {
                System.out.print("*");



            } System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("계단 층수를 입력하시오: ");
        int a = in.nextInt();
        staircase(a);
    }
}
