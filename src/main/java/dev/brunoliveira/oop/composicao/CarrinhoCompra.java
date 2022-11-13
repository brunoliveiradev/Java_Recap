package dev.brunoliveira.oop.composicao;

public class CarrinhoCompra {

    public static void main(String[] args) {
        Compra carrinho = new Compra();

        carrinho.cliente = "John";
        carrinho.itens.add(new Item("Caneta", 20, 7.45));
        carrinho.itens.add(new Item("Caderno", 10, 9.25));

        System.out.println(carrinho.itens.size());
        System.out.println(carrinho.getValorTotal());


    }
}
