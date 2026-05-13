package ArrayELista.Exercicios.Palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {
    static void main() {


        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Almir");
        list.add("Alberto");
        list.add("Luiza");
        list.add("Anna");

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("--------------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A')
                .toList();

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("----------------------------------");

        String frist = result.stream()
                .filter(x -> x.charAt(0) == 'A')
                .findFirst()
                .orElse(null);

        System.out.println(frist);
    }
}
