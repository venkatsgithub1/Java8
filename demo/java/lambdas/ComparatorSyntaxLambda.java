package demo.java.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorSyntaxLambda {
    public static void main(String... args) {
        Comparator<String> c = (s1, s2) ->
                Integer.compare(s1.length(), s2.length());
        List<String> strings = new ArrayList<>();

        strings.add("Albert");
        strings.add("Bob");

        strings.sort(c);

        System.out.println(strings);
    }
}
