package org.example.exam3;

import java.util.ArrayList;
import java.util.List;

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
}
