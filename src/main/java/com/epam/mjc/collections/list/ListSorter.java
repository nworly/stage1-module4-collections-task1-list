package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);

        int funcA = (int) ((Math.pow(5 * intA, 2)) + 3);
        int funcB = (int) ((Math.pow(5 * intB, 2)) + 3);

        if (funcA == funcB) {
            return intA - intB;
        }
        return funcA - funcB;
    }
}
