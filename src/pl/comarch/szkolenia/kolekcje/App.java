package pl.comarch.szkolenia.kolekcje;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(30);
        /*lista.add("ABC");
        lista.add(3.3);
        lista.add(new Random());*/

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));

        lista.remove(1);

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        System.out.println(lista.size());

        int a = 5;
        Integer a2 = 5;

        double d = 3.3;
        Double d2 = 3.3;

        //lista.trimToSize();

        System.out.println(lista);

        metoda1(lista);
        metoda2(lista);
    }

    private static void metoda1(List list) {
        //??
        //??
        //??
    }

    private static void metoda2(List list) {
        //??
        //??
        //??
    }
}
