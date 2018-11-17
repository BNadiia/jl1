package collection;

import java.util.*;

public class Dispatcher {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        // System.out.println(al.size());
        al.add("Serg");
        al.add(15);
        //System.out.println(al.size());
        al.add(3.2);
        al.add(new Car());
        // System.out.println(al.size());
        // System.out.println(al);
        ArrayList inner = new ArrayList();
        inner.add("Mary");
        inner.add("Max");
        inner.add(new Car());
        //al.add(inner);
        al.addAll(inner);
        // System.out.println(al.size());
        //System.out.println(al);
        ////
        al.add(3, "Lucy");
    //    System.out.println(al);
        // List al2 = al.subList(2, 5);
        //System.out.println(al2);
        //       al2.add("Andrew");
//        System.out.println(al2);
//        System.out.println(al);
        al.add(1000);
        //      System.out.println(al2);
    //    System.out.println(al);
        ArrayList al3 = new ArrayList(al.subList(2, 5));
        al3.add("Andrew");
        al.add(4, 1000);
      //  System.out.println(al);
     //   System.out.println(al3);
        /////////////////////
        ArrayList<String> als =  new ArrayList<>();
        als.add("Serg"); als.add("Mary"); als.add("Ann"); als.add("Max");
       // als.add(25);
        String[] s = new String[als.size()];
        s = als.toArray(s);   // convert list to array
   //     System.out.println(als);
     //   System.out.println(Arrays.toString(s));
        s[1] = "Vlad";
      //  System.out.println(als);
      //  System.out.println(Arrays.toString(s));
        als.add("Mark");
      //  System.out.println(als);
      //  System.out.println(Arrays.toString(s));
        String[] s1 = {"Dnipro","Lviv", "Odesa", "Kyiv"};
        List<String> ls = Arrays.asList(s1);
       // System.out.println(Arrays.toString(s1));
     //   System.out.println(ls);
        s1[0] = "Frankivsk";
        System.out.println(Arrays.toString(s1));
        System.out.println(ls);
        ls.set(2, "Kharkiv");
    //    ls.add("Lutsk");  //CE
        ArrayList<String> alsGood = new ArrayList<>(Arrays.asList(s1));





    }
}
//Метод toArray() не підлягає властивості backed Collections
//Метод asArray() не підлягає властивості backed Collections, зміна розміру такої колекції неможлива