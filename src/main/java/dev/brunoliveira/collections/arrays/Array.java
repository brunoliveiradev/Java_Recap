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

        for (int i = 0; i < dates.length; i++) {
            System.out.print(dates[i] + " ");
        }
        System.out.println("\n" + Arrays.toString(dates));
    }

}
