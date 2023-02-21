package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Maria");
        list.add("Joao");
        list.add("Jose");
        list.add("Ana");
        list.add(2, "Marco");
        System.out.println(list);
        System.out.println();
        list.removeIf(name -> name.charAt(0) == 'M');
        System.out.println(list);
        System.out.println();
        System.out.println("Index of Joao: " + list.indexOf("Joao"));
        System.out.println("Index of Maria: " + list.indexOf("Maria"));

        List<String> result = list.stream()
                .filter(x -> x.charAt(0) == 'A')
                .collect(Collectors.toList());
        System.out.println();
        System.out.println(result);

    }
}
