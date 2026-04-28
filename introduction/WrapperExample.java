package oop_with_java.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a+" "+b);

        //final int INCREASE = 2;
       // INCREASE = 3;  // it give me some error reason being INCREASE if final;
       final A avijit = new A("Avijit Bhakta");
       avijit.name = "Other name"; // u can re-factor it .


      // when a non-primitive is final,but u can't re-assign it.
     // avijit = new A("Avijit");

     A obj = new A("wdhjwwe");
        System.out.println(obj);
//     for(int i = 0;i<100;i++){
//        obj = new A("Random name");
//     }

        
    }
    static void swap(Integer a ,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A{
    final int num = 10; // final variable have to be initialized
    String name;

   public A(String name){
   // System.out.println(name);
    this.name = name;
   }

   @Override
   protected void finalize() throws Throwable{
    System.out.println("Object is destroyed");
   }

}
