package org.example.exam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TimeConversion {
    public static void timeConversion(List<Integer> list) {
        SimpleDateFormat formatDate = new SimpleDateFormat("HH:mm:s");
        Date date = new Date();
        System.out.println("formatDate = " + formatDate.format(date));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        timeConversion(list);
    }
}
