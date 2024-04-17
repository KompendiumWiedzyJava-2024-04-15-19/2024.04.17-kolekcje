package pl.comarch.szkolenia.kolekcje;

import java.util.HashMap;

public class App3 {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("db.ip", "12.12.12.12");
        mapa.put("db.port", "1521");
        mapa.put("db.user", "admin");

        mapa.get("db.user");
    }
}
