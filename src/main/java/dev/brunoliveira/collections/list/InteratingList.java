package dev.brunoliveira.collections.list;

import java.util.*;

public class InteratingList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("element at index " + i + " is " + numbers.get(i));
//            numbers.remove(2); out of bounds exception
        }

        for (Integer number : numbers) {
            System.out.println("numer = " + number);
//            numbers.remove(2); concorrent modification exception
        }

        //Iterator allows remove elementos
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
        }
        System.out.println(numbers);

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        for (ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious(); ) {
            System.out.println(listIterator.previous());
            listIterator.remove();
        }

        System.out.println(numbers);

        String[] names = {"Tommy", "Mike", "Anthony"};
        List<String> list = Arrays.asList(names);
        list.set(0, "Tom");
        System.out.println(names[0]);
    }
}
