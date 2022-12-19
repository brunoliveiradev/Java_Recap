package dev.brunoliveira.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMoreExamples {

    public static void main(String[] args) {
        //    List<double> doubleList = new ArrayList<>();  nao compila pois tipos primitivos não são uma classe
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5); // autoboxing
        doubleList.add(55.10);
        double first = doubleList.get(0); //unboxing
        System.out.println(doubleList + " " + first);

        List<String> names = new ArrayList<>();
        names.add("Anthony");
        names.add("Tony");
        names.add("Stark");

        Object[] namesToArray = names.toArray();
        System.out.println(namesToArray.length);

        String[] stringArray = names.toArray(new String[names.size()]);
        List<String> petsList = Arrays.asList("dog", "cat", "parrot"); // retorna um tamanho fixo de lista

        System.out.println(petsList.size());
    }

}
