package structureExtended;

public class Handler {
    public static void main(String[] args) {
        int x = -50, y = 8;
//        System.out.println(x/y);    //6   -6
//        System.out.println(x%y);    //2   -2?
        int z = 48;
        if (z % 2 == 0) {
//            System.out.println("Odd");
        } else {
//            System.out.println("Even");
        }
        //////////////////////////////////////////////////////
        String s = (z % 2 == 0) ? "Odd" : "Even";   //ternary operator
        //     1 =  2(boolean)  ?  3    :  4;
        //     1 = 3 if 2 = true
        //       = 4 if 2 = false
        //////////////////////////////////////////////////////
        byte a = 20;
//        a = a + 1;
//        a = ++a;
//        a += 1;
//        a++;
//        ++a;
        a = a++;     // 20, not 21
//        System.out.println(a);
//        int b = a++;    //postfix
//        int b = ++a;    //prefix
//        System.out.println(a + " " + b);
        /////////////////////////////////////////////////////////
/*        boolean b1 = true;
        boolean b2 = false;
//        System.out.println(b1 ^ b2);      // ^ - karat XOR  eXlusive OR
        /////////////////////////////////////////////////////////
        boolean enoughMoney = true;
        boolean haveFreeFriends = true;
        if (enoughMoney && haveFreeFriends) {     //short-cirquit
            System.out.println("Go to cinema");
        } else {
            System.out.println("Go to HomeGames");
        }
        boolean haveCash = true;
        boolean haveCard = true;
        if (haveCash || haveCard) {     //short-cirquit
            System.out.println("Go to cinema");
        } else {
            System.out.println("Go to HomeGames");
        }
*/
        int q = 20, w = 21, e = 30, r = 31;
        boolean b1 = q++ < --w;
        boolean b2 = e++ == ++r;
        if (q++ < --w && e++ == ++r) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println(q + " " + w + " " + e + " " + r + " ");
        //NO 21 30 21 32  &
        //NO 21 30 30 31  &&
        //Замикальні фукнції не потрібно використовувати, якщо змінні можуть змінитись, але краще це обійти, щоб зекономити ресурси


    }
}

//ст 133
//задача по масивах 18, 17,
//двовимірні 8
