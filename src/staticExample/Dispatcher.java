public class Dispatcher {
    public static void main(String[] args) {
        Account accountS = new Account();
        Account accountM = new Account();

        accountS.owner = "Serg";
        accountS.money = 100;
        Account.courseUSD_UAH = 28.5;

        accountM.owner = "Mary ";
        accountM.money = 150;
        Account.courseUSD_UAH = 28.6;

        accountS.money = 110;

        //System.out.println(Account.courseUSD_UAH);   //28.5 or 28.6
//______________________

        Bentley bentley1 = new Bentley();
        bentley1.colour = "White";
        Bentley.count = 1;

        Bentley bentley2 = new Bentley();
        bentley2.colour = "Red";
        Bentley.count = 2;




    }
}

class  Bentley {
    String colour;
    static  int count;

}


class Account {
    String owner;
    int money;
    static double courseUSD_UAH;

}