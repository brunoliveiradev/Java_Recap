package dev.brunoliveira.collections.arrays;

public class ForEach {

    public static void main(String[] args) {
        double[] notas = {9.9, 10, 8.7, 7.2, 6.5, 5.6, 4.6, 3.6, 9.4};

        for(double nota : notas) {
            System.out.println(nota);
        }
    }
}
