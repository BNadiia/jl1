package sortingExample;

import java.util.Arrays;
import java.util.Comparator;

public class Dispatcher {
    public static void main(String[] args) {
        String s[] = {"Serg", "Mary", "Ann", "Max", "Alex", "Mark"};
        Arrays.sort(s);
//        System.out.println(Arrays.toString(s));
        Flower flowers[] = {new Flower("Rose", "white", 70, 40),
                new Flower("Daisy", "red", 20, 10),
                new Flower("Lily", "white", 80, 30),
                new Flower("Viola", "yellow", 10, 4)};

        Arrays.sort(flowers);
        System.out.println(Arrays.toString(flowers));

        Arrays.sort(flowers, new Comparator(){
            public int compare(Object o1, Object o2) {
            return ((Flower)o1).price - ((Flower)o2).price;
        }});
        System.out.println(flowers);

        Arrays.sort(flowers, new Flower.ComparatorByLength());
        System.out.println(Arrays.toString(flowers));




    }
}
