package demo.java8InAction.utilFunction;

public class Employee {
    private String name;
    private Integer age;

    Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee Name: "+getName()+" Age: "+getAge();
    }
}
