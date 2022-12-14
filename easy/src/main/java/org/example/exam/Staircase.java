package org.example.exam;

import java.util.Scanner;

public class Staircase {

    public static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-1) - i; j++) { //삼각형 별을 출력하기 위해 공백 생성
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) { //각행의 홀수(삼각형줄) 만큼 별출력
                System.out.print("#");
            }
            System.out.println();
        }
    }
        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.print("계단 층수를 입력하시오: ");
            int a = in.nextInt();
            staircase(a);
        }
    }
