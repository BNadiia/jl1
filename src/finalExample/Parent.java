package finalExample;

public class Parent {
  int y = 20;

    private /*final*/ void display (){
        System.out.println("Parent");
    }

    static void m(){
        System.out.println("Parent static");
    }
}
