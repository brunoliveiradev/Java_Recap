package dev.brunoliveira.collections.collecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("Little Prince - return true of false");
        livros.push("LOR - Adiciona, se nao conseguir retorna exception");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.pop());
    }
}
