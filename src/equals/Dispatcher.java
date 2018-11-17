package equals;

public class Dispatcher {
    public static void main(String[] args) {
        Flower f1 = new Flower("Rose", "Red", 80);
        Flower f2 = new Flower("Rose", "Red", 80);

        System.out.println(f1 == f2);       // true | false
        System.out.println(f1.equals(f2));  // second type, parameters
        Object o = f1;                      //first type, assignment

        String s1 = new String("Serg");
        String s2 = new String("Serg");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));




    }
}


//page 133 Шилд