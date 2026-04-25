package oop_with_java;
import java.util.Arrays;

public class introduction {
    public static void main(String[] args) {
        //Traditional way 
        //Store five students roll numbers,name & marks;
        int[] numbers = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        Student[] students = new Student[5];
       // System.out.println(Arrays.toString(students));
        // Student Avijit = new Student();
        // Avijit.ron = 32;
        // Avijit.name = "Avijit Bhakta";
        // Avijit.marks = 76.4f;
        // System.out.println(Avijit.ron);
        // System.out.println(Avijit.name);
        // System.out.println(Avijit.marks);

       
        // Student Avijit = new Student(32,"Avijit Bhakta",45);
        // System.out.println(Avijit.ron);
        // System.out.println(Avijit.name);
        // System.out.println(Avijit.marks);
        Student random = new Student();
        System.out.println(random.ron);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student one = new Student(); // one and two reference variable refer the 
        Student two = one;           // same object don't copy the object or any thing;
    }
    
}
class Student{
        int ron;
        String name;
        float marks = 90;//default case;

        void greeting(){
             System.out.println("Hello my name is "+name);
        }
        Student(){
            // this is how we call a constructor from another constructor
            this( 0, "default person", 100f);
        }

        // we add a way to add value properties of this class object by object;
        Student(int roll,String name,float marks){
            this.ron = roll;
            this.name = name;
            this.marks = marks;
        }
    }
