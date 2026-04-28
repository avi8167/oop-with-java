package oop_with_java.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human avijit = new Human("Avijit",23,15000,false);
//       Human rahul = new Human("Rahul",32,10000,true);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        Human arpit = new Human("Arpit",38,10000,true);
//        System.out.println(Human.population);
        //greeting();
        Main funn = new Main();
        funn.fun2();
    }
    // this is not depend on object.
    static void fun(){
        //greeting();
        // u cant use this because it requires some instance
        // but the function you are using it in does not depend on instance ;

        // u cant access non-static stuff with creating without referencing their instances
        // in a context of static

        // hence here I am referencing it;
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }
    // we know that something which is not static, belongs to object.
    void greeting(){
//        fun();
        System.out.println("Hello world");
    }
}
