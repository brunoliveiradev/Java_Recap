package dev.brunoliveira.collections.collecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.add("Tanto add quanto offer adiciona");
        fila.add("Brasil");
        fila.add("add: Lanca excecao quando fila cheia");
        fila.offer("Canada");
        fila.offer("offer: Retorno falso quando fila cheia");

        System.out.println(fila.peek() + " peek: Retorna null quando a fila esta vazia");
        System.out.println(fila.element() + " element: Retorna exception quando a fila esta vazia");

        System.out.println(fila.poll() + " poll: pega o proximo e remove da lista, retorna falso se vazio");
        System.out.println(fila.remove() + " remove: pega o proximo e remove da lista, retorna excecao se vazio");

        if(!fila.isEmpty()){
            fila.clear();
        }
    }
}
