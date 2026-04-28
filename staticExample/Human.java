package oop_with_java.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
