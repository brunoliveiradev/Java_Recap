package dev.brunoliveira.collections.arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        double[] notas = new double[4];
        System.out.println(Arrays.toString(notas));
        notas[0] = 7.9;
        notas[1] = 8;
        notas[2] = 6.7;
        notas[3] = 9.7;
        System.out.println(Arrays.toString(notas));

        double total = 0;

        for (double nota : notas) {
            total += nota;
        }
        System.out.println(total / notas.length);

        int[] dates = {5, 10, 2};
        Arrays.sort(dates);

        for (int date : dates) {
            System.out.print(date + " ");
        }
        System.out.println("\n" + Arrays.toString(dates));


        int[] sortedNumbers = {1, 3, 5, 7, 11};
        System.out.println(Arrays.toString(sortedNumbers));
        System.out.println("Arrays classificados, onde aparecer negativo é pq nao achou ou é a referencia de onde deveria inserir");
        System.out.println(Arrays.binarySearch(sortedNumbers, 3));
        System.out.println(Arrays.binarySearch(sortedNumbers, 2));
        System.out.println(Arrays.binarySearch(sortedNumbers, 5));
        System.out.println(Arrays.binarySearch(sortedNumbers, 4));
        System.out.println(Arrays.binarySearch(sortedNumbers, 11));

        int[] notSortedNumbers = {5, 4, 10, 8, 6};
        System.out.println("Resultado imprevisivel pois array nao esta classificado");
        System.out.println(Arrays.binarySearch(notSortedNumbers, 5));
        System.out.println(Arrays.binarySearch(notSortedNumbers, 8));
    }

}
