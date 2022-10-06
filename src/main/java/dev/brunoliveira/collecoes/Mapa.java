package dev.brunoliveira.collecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Long, String> usuarios = new HashMap<>();
        usuarios.put(1L, "Roberto");
        usuarios.put(1L, "Ricardo");
        usuarios.put(2L, "Romario");
        usuarios.put(3L, "Ronaldo");

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20L));
        System.out.println(usuarios.containsValue("Ronaldo"));

        for(Map.Entry<Long, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
