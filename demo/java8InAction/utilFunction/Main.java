package demo.java8InAction.utilFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

        /*
        Predicate that test for heavy apples
        weight > 20.
         */
        Predicate<Apple> heavyApples = a -> a.getWeight() > 20;
        /*
        Consumer that prints any apple.
         */
        Consumer<Apple> printer = System.out::println;
        /*
        Consumer can directly be used as below.
         */
//        printer.accept(list);
        /*
        Call to method printHeavyApples.
         */
        printHeavyApples(list, heavyApples, printer);
        /*
        Supplier that prints a random apple.
         */
        Supplier<Apple> randomApple = () -> list.get(new Random().nextInt(list.size()));
        /*
        Calling getRandomApple method.
         */
        System.out.println(getRandomApple(randomApple));
        /*
        for each apple in list, do work in printer.
        forEach takes a consumer, printer is a consumer.
         */
        list.forEach(printer);

        /*
        A function to create a modified string from apple data.
         */
        Function<Apple, String> modifiedString = (a) -> "Apple " + a.getId() + " weighs " + a.getWeight();

        /*
        In the below example, a random apple is taken and modifiedString function is applied on it.
         */
        System.out.println(modifiedString.apply(randomApple.get()));

        List<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee("Albert Einstein", 25));
        employeesList.add(new Employee("Richard Feynman", 26));
        employeesList.add(new Employee("Alfred Nobel", 25));
        employeesList.add(new Employee("Dick Cheney", 27));
        employeesList.add(new Employee("Abraham Lincoln", 28));
        employeesList.add(new Employee("Marie Curie", 30));

        /*
        Function returns name of the employee.
         */
        Function<Employee, String> getEmpName = Employee::getName;

        /*
        getInitials returns initials of name of
        employee.
         */
        Function<String, String> getInitials = s -> s.substring(0, 1);

        /*
        We want to get the name of the employee first and extract initials.
         */
        Function<Employee, String> getInitialOfEmployee = getInitials.compose(getEmpName);

        /*
        printing initials.
         */
        for (Employee e : employeesList) {
            System.out.println(getInitialOfEmployee.apply(e));
        }

        /*
        Same thing in a different way using andThen.
         */
        for (Employee e : employeesList) {
            System.out.println(getEmpName.andThen(getInitials).apply(e));
        }

        /*
        identity function returns the same object applied.
         */
        for (Employee e : employeesList) {
            System.out.println(Function.identity().apply(e));
        }

    }

    private static <T> T getRandomApple(Supplier<T> supplier) {
        return supplier.get();
    }

    private static <T> void printHeavyApples(List<T> list, Predicate<T> predicate, Consumer<T> consumer) {
        for (T t : list) {
            if (predicate.test(t)) {
                consumer.accept(t);
            }
        }
    }
}
