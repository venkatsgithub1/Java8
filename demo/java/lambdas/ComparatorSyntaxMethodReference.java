package demo.java.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorSyntaxMethodReference {
    public static void main(String... args) {
        Comparator<Integer> c = Integer::compare;
        List<Integer> integers = new ArrayList<>();

        integers.add(669);
        integers.add(9);

        integers.sort(c);

        System.out.println(integers);

        Comparator<String> c1 = Comparator.comparingInt(String::length);

        List<String> strings = new ArrayList<>();

        strings.add("Albert");
        strings.add("Bob");

        strings.sort(c1);
    }
}
