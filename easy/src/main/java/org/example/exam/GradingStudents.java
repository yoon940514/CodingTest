package org.example.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int i1 = 0;
        for (int i = 0; i < size; i++) {
            int a = in.nextInt();
            grades.add(a);
            if (a>=38) {
                if (grades.get(i) % 5 == 3) {
                    i1 = grades.get(i) + 2;
                    grades.set(i, i1);
                } else if (grades.get(i) % 5 == 4) {
                    i1 = grades.get(i) + 1;
                    grades.set(i, i1);
                }
            }
        }

        return grades;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        gradingStudents(grades);
        for (int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }
    }
}
