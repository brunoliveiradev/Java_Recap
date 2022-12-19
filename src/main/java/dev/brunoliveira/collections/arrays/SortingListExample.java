package dev.brunoliveira.collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingListExample {

    public static void main(String[] args) {

        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        System.out.println("ArrayList of Strings: " + numsList);

        Collections.sort(numsList);
        System.out.println("Sorted as String: " + numsList);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(500);
        numbers.add(10);
        numbers.add(9);
        numbers.add(50);
        numbers.add(40);
        System.out.println("ArrayList of Integers: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted as integers: " + numbers);

        List<Integer> anotherNumberList = Arrays.asList(5, 4, 8, 10, 11, 7, 3); //limited size and elements
        System.out.println("anotherNumberList: " + anotherNumberList);

        Collections.sort(anotherNumberList);
        System.out.println("Sorted anotherNumberList: " + anotherNumberList);
    }

}
