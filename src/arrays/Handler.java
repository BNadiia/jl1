package arrays;

import java.util.Arrays;

public class Handler {
    public static void main(String[] args) {
        int[] x = {5, 17, 4, 8, 16, 9, 3, 2, 1, 12, 15};
        //       Arrays.sort(x);
        //      System.out.println(Arrays.toString(x));
        //       System.out.println(Arrays.binarySearch(x, 11));
        ///////////////////////////////////////////////////////////////////
        int[] y = {5, 3, 7, 6};
        //int[]            //declaring
        //y = new int[4]            //building
        //y[0] = 5, y[1] = 3 ...           //initialization
        //int[] z = new int[];
        /////////////////////////
        Car[] c = {new Car(), new Car(), new Car()};

        int[][] a = {{7, 4, 2}, {3}, {9, 5}, {6, 3, 8, 1, 5, 9}};
        // int[][] a;
        //a = new int [4][]
        //a[0] = new int[3];
        //a[1] = new int[1];
        //a[2] = new int[2];
        //a[3] = new int[6];
        //a[0][0] = 7;
        /////////////////////
        Car[][] c2 = new Car[3][];








    }
}


//Метод binarySearch починен застосовуваись до відсортованих масивів, якщо масив не відсортоватий, то відповідь майже випадкова
//Якщо розшукується число якщого немає в масиві повертається від'ємний результат  : -i-1, де і - індекс елемента, якби він був присутній у відсортованому масиві
