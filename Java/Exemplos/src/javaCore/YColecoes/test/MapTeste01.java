package javaCore.YColecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class MapTeste01 {
    public static void main(String[] args) {
        //Map<String, String> map = new HashMap<>();

        Map<String, String> map = new LinkedHashMap<>();
        map.put("tekclado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2");

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("-----------------------------");

        for (String value : map.keySet()) {
            System.out.println(value + " : " + map.get(value));
        }

        System.out.println("-----------------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -" + entry.getValue());
        }
    }
}
