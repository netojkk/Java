package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


        list.add("null");
        list.add("tentando");
        list.add("ola");
        list.add("peteco1");
        list.add("peteco2");
        list.add("peteco3");

        list.add(2, "falar");

        System.out.println(list.size());
        // list.remove("peteco");    
        // list.remove("peteco");    
        // list.remove(1);    
        
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-----------------");
        
        // remove todos os elementos que começam com a letra 'p'
        // list.removeIf(x -> x.charAt(0) == 'p');
        
        System.out.println("-----------------");
        System.out.println("IndexOf: "+(list.indexOf("peteco")));
        System.out.println("-----------------");

        // thats a possible way to filter a list with your own condition
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'p').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }
    }
}
