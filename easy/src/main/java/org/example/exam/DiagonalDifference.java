package org.example.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        return 0;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        List<Integer> innerarr = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int rowscolumnsnumber = in.nextInt();


        for (int j=0; j<rowscolumnsnumber; j++) {
           innerarr.add(in.nextInt());
        }

        System.out.println("innerarr = " + innerarr);
        System.out.println("arr = " + arr);

        innerarr.clear();
        arr.add(innerarr);
        for (int j=0; j<rowscolumnsnumber; j++) {
            innerarr.add(in.nextInt());

        }
        innerarr.clear();
        arr.add(innerarr);

        System.out.println("innerarr = " + innerarr);
        System.out.println("arr = " + arr);

        for (int j=0; j<rowscolumnsnumber; j++) {
            innerarr.add(in.nextInt());
        }
        innerarr.clear();
        arr.add(innerarr);

        System.out.println("innerarr = " + innerarr);
        System.out.println("arr = " + arr);

    }
}
