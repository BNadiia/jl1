package modifiers.packageOne;

import initialization.Test;
import modifiers.packageTwo.Test2;
import modifiers.packageTwo.Test3;

public class Dispatcher extends  Test3{
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        Test3 t3 = new Test3();
        Dispatcher d = new Dispatcher();

//        System.out.println(t1.a1);
//        System.out.println(t1.a2);
//        System.out.println(t1.a3);
//        System.out.println(t1.a4);

//        System.out.println(t2.b1);
//        System.out.println(t2.b2);
//        System.out.println(t2.b3);
//        System.out.println(t2.b4);

        System.out.println(t3.c1);
        System.out.println(d.c2);               //?
//        System.out.println(t3.c3);
//        System.out.println(t3.c4);



    }
}


// ДО протектед-елементів з інших пакетів мають доступ виключно об'єкти підкласів і тільки з середини цих підкласів