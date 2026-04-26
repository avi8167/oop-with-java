package oop_with_java.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a+" "+b);

        //final int INCREASE = 2;
       // INCREASE = 3;  // it give me some error reason being INCREASE if final;

        
    }
    static void swap(Integer a ,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A{
    final int num = 3; // final variable have to be initialized
}
