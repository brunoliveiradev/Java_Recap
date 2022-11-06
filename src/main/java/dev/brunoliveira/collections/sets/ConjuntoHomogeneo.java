package dev.brunoliveira.collections.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogeneo {

    public static void main(String[] args) {

        SortedSet<String> lista = new TreeSet<>();

        lista.add("TreeSet faz parte tbm do sortedSet, que aceita criterio de ordenaçao, diferente do HashSet que não aceita.");
        lista.add("Ana");
        lista.add("Bruno");
        lista.add("Henrique");

        for(String candidato: lista) {
            System.out.println(candidato);
        }

        Set<Double> numeros = new HashSet<>();
        numeros.add(1.0);
        numeros.add(2.0);
        numeros.add(123.0);
        numeros.add(2003.0);
        numeros.add(5.0);
        numeros.add(15.0);

        for(Double n: numeros) {
            System.out.println(n);
        }
    }
}
