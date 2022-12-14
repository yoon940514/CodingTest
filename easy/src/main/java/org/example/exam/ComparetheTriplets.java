package org.example.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComparetheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List <Integer> c = new ArrayList<Integer>();
        c.add(0);
        c.add(0);

        for (int i=0; i<3; i++) {
            int c1=c.get(0);
            int c2=c.get(1);
            if (a.get(i) > b.get(i)) {
                c.set(0,c1+1);
            } else if (a.get(i) < b.get(i)) {
                c.set(1,c2+1);
            }
        }

        return c;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        int aValue;
        int bValue;
        Scanner in = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            aValue = in.nextInt();
            a.add(aValue);
        }

        System.out.println("userA: " + a);

        for (int i=0; i<3; i++) {
            bValue = in.nextInt();
            b.add(bValue);
        }

        System.out.println("userB: " + b);
        System.out.println("score: " + compareTriplets(a,b));;

    }
}
