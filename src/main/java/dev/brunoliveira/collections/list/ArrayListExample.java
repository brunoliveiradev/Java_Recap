package dev.brunoliveira.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList(); // this has the same type as myList2
        ArrayList<Object> myList2 = new ArrayList<Object>();

        ArrayList<String> listz = new ArrayList<>(); //diamond operator
        List<String> list2 = new ArrayList<>(); // using List interface as type

//        ArrayList<String> list4 = new List<>(); // o inverso nao complila.
        List<String> list5 = new ArrayList<>(20);

        List list = new ArrayList();
        // List<Object> list = new ArrayList<>(); --> same as line 18
        list.add("dog");
        list.add(5);
        System.out.println(list); //aqui o println chama automaticamente list.toString() para imprimir.

        List<String> pets = new ArrayList<>();
        pets.add("cat");
        System.out.println(pets);

        pets.add(0, "dog");
        System.out.println(pets);

//        pets.add(5); nao compila pois conforme foi criado aceita apenas String
        pets.add(1, "parrot"); //quando voce adiciona num index ja existente ele move os elementos para direita (+1) no index
        pets.add(0, "husky");
        pets.add(1, "bird");
        System.out.println(pets);

        pets.remove(1);
        System.out.println(pets);

        pets.remove("parrot");
        System.out.println(pets);

//        pets.remove(3); //Exception: out of bound exception

        pets.set(0, "lion"); //muda o elemento no index especifico
        System.out.println(pets);

//        pets.set(6, "something"); // Exception: Index 6 out of bounds for length 3
        System.out.println(pets);

        System.out.println("is empty? " + pets.isEmpty()); // return false because list is not empty
        System.out.println("size: " + pets.size());

        System.out.println("contains dog? " + pets.contains("dog"));

        List<String> newPets = new ArrayList<>();
        newPets.add("dog");
        newPets.add("cat");

        System.out.println(pets.equals(newPets)); // if size, elements and order are the same then true

        pets.clear(); // remove all the elements from the list
        System.out.println("is empty? " + pets.isEmpty());
    }
}
