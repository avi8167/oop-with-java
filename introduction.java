package oop_with_java;
import java.util.Arrays;

public class introduction {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));
        
    }
    class Student{
        int ron;
        String name;
        float marks;
    }
}
