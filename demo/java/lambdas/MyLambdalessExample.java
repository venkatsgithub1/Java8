package demo.java.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyLambdalessExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Al", 30));
        personList.add(new Person("Bob", 26));
        personList.add(new Person("Carl", 28));
        personList.add(new Person("Don", 25));
        personList.add(new Person("Ethan", 27));
        personList.add(new Person("Frank", 22));

        personList.sort(new PersonComparator());

        System.out.println(personList);
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() == o2.getAge())
            return 0;
        return o1.getAge() > o2.getAge() ? 1 : -1;
    }
}
