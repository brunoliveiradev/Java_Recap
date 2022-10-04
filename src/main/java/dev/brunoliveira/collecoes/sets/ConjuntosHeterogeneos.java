package dev.brunoliveira.collecoes.sets;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosHeterogeneos {

    public static void main(String[] args) {

        Set conjunto = new HashSet<>();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add('x');
        conjunto.add(1);
        conjunto.add("Não aceita repetição, pode fazer uniao e intersecçao de dados");

        System.out.println("Tamanho do conjunto: " + conjunto.size());

        conjunto.remove('x');
        System.out.println("Contém a letra x? : " + conjunto.contains('x'));
    }
}
