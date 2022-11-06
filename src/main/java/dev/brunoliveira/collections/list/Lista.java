package dev.brunoliveira.collections.list;

import dev.brunoliveira.collections.entities.Usuario;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario("Nome", "email");

        usuarios.add(usuario);
        usuarios.add(new Usuario("Hello", "World"));
        usuarios.add(new Usuario("Bruno", "bruno@email.com"));
        usuarios.add(new Usuario("username", "user@email.com"));

        System.out.println(usuarios.get(2));

        for (Usuario u : usuarios) {
            System.out.println(u.getUsername());
        }

    }
}
