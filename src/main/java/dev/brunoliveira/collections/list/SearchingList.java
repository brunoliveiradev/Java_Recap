package dev.brunoliveira.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchingList {
    public static void main(String[] args) {

        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        System.out.println(numsList);

        int index = Collections.binarySearch(numsList, "10");
        System.out.println(index); // -1 means not sorted / undefined

        Collections.sort(numsList); // sort
        System.out.println(numsList);

        index = Collections.binarySearch(numsList, "10");
        System.out.println(index); // now the index is sorted and bring the position correct
    }
}
