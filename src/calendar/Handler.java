package calendar;

import java.util.*;
import static java.util.Calendar.*;

public class Handler {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(YEAR));            //2018
        System.out.println(gc.get(MONTH));           //09   08
        System.out.println(gc.get(DAY_OF_MONTH));    //24
        System.out.println(gc.get(DAY_OF_WEEK));      //1     2

        gc.set(MONTH, DECEMBER);
        gc.set(DAY_OF_MONTH, 21);
        System.out.println(gc.get(DAY_OF_WEEK));

        gc.add(DAY_OF_MONTH,12);
        System.out.println(gc.get(YEAR));
        System.out.println(gc.get(MONTH));
        System.out.println(gc.get(DAY_OF_MONTH));

        Date d = gc.getTime();        //convert GC to DATE

        GregorianCalendar gc1 = new GregorianCalendar();
        gc1.setTime(d);              // convert DATE to GC

    }
}



//порахувати кількість днів 2 світової війни
//вивести дні тиждня свого дн на три роки
//хостман. ст 141
//вивести календарик на поточний місяць
//і варіант з початком в понеділок
//тема 10