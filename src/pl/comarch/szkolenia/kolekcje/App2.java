package pl.comarch.szkolenia.kolekcje;

import java.util.HashSet;
import java.util.TreeSet;

public class App2 {
    public static void main(String[] args) {
        TreeSet<String> zbior = new TreeSet<>();

        zbior.add("Zbyszek");
        zbior.add("Adam");
        zbior.add("Wiesiek");
        zbior.add("Borys");

        System.out.println(zbior.size());

        zbior.add("Zbyszek");
        System.out.println(zbior.size());

        System.out.println(zbior);
    }
}
