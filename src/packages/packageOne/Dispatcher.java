package packages.packageOne;

//import packages.packageTwo.Test3;
//import packages.packageTwo.Test2;
import packages.packageTwo.*;
import packages.packageThree.Test3;
import  static packages.packageTwo.Test2.*;
import  static packages.packageOne.Test1.*;


public class Dispatcher {
    public static void main(String[] args) {

       // int x3 =60;

        Test1 t1 = new Test1();
        System.out.println(t1.z1);
        System.out.println(Test1.z3);
        System.out.println(z4);

      //  packages.packageTwo.Test2 t2 = new packages.packageTwo.Test2();
        Test2 t2 = new Test2();


        packages.packageTwo.Test3 t3 = new packages.packageTwo.Test3();
        System.out.println(t3.y1);

        System.out.println(Test3.y3);

        System.out.println(x3);


    }
}
