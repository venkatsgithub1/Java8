package demo.java.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyLambda1 {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Al", 30));
        personList.add(new Person("Bob", 26));
        personList.add(new Person("Carl", 28));
        personList.add(new Person("Don", 25));
        personList.add(new Person("Ethan", 27));
        personList.add(new Person("Frank", 22));

        // Using a lambda.
        personList.sort((Person p1, Person p2) ->
                Integer.valueOf(p1.getAge()).compareTo(Integer.valueOf(p2.getAge())));

        // Further reduction, getting rid of types.
        personList.sort((p1, p2) ->
                Integer.valueOf(p1.getAge()).compareTo(Integer.valueOf(p2.getAge())));
        System.out.println(personList);
    }
}
