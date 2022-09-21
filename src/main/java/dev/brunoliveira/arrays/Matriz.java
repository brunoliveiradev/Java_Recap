package dev.brunoliveira.arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT);

        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();

        System.out.print("Digite quantas notas terá por aluno: ");
        int qtdNotas = scanner.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
        double total = 0;

        for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
            for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
                System.out.printf("Informe a nota %d do aluno %d: ", nota + 1, aluno + 1);

                notasDaTurma[aluno][nota] = scanner.nextDouble();
                total += notasDaTurma[aluno][nota];
            }
        }
        double media = total / (qtdAlunos + qtdNotas);
        System.out.printf("Média da turma é: %.2f %n", media);

        for(double[]notasIndividuais : notasDaTurma) {
            System.out.println(Arrays.toString(notasIndividuais));
        }

        scanner.close();
    }
}
