package org.example.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleandOrange {
    public static String appendAndDelete(String s, String t, int k) {

        ArrayList<Character> sArray = new ArrayList<Character>();
        ArrayList<Character> tArray = new ArrayList<Character>();

        char[] chars = s.toCharArray();
        for (char c : chars){
            sArray.add(c);
        }

        char[] chart = t.toCharArray();
        for (char c : chart){
            tArray.add(c);
        }

        if (sArray.size() + tArray.size() < k) {
            return "Yes";
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();



        appendAndDelete(s, t, k);
    }
}
