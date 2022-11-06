package dev.brunoliveira.collections.arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useLocale(Locale.ROOT);

        System.out.println("Digite a quantidade de alunos que será calculado a média de notas: ");
        int sizeArray = reader.nextInt();
        double[] notas = new double[sizeArray];

        System.out.printf("Digite as %s notas de alunos a serem calculadas média: %n", sizeArray);

        for (int i = 0; i < sizeArray; i++) {
            notas[i] = reader.nextDouble();
        }
        reader.close();

        double soma = 0;
        for(double nota : notas) {
            soma += nota;
        }

        double media = (soma / sizeArray);
        System.out.printf("A média de notas é: %.2f", media);
    }
}
