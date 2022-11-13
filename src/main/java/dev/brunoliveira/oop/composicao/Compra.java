package dev.brunoliveira.oop.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<>();


    double getValorTotal() {
        double valorTotal = 0;

        for (Item item : itens) {
            valorTotal += item.quantidade * item.preco;
        }

        return valorTotal;
    }
}
