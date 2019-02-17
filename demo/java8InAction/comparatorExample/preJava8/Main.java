package demo.java8InAction.comparatorExample.preJava8;

import demo.java8InAction.comparatorExample.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();

        Apple apple = new Apple();
        apple.setId(1);
        apple.setWeight(45);

        Apple apple2 = new Apple();
        apple2.setId(2);
        apple2.setWeight(23);

        Apple apple3 = new Apple();
        apple3.setId(3);
        apple3.setWeight(12);

        list.add(apple);
        list.add(apple2);
        list.add(apple3);

        Collections.sort(list, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight()-o2.getWeight();
            }
        });

        for(Apple appleInList:list) {
            System.out.println(appleInList);
        }
    }
}
