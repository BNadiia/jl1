package staticExample.staticMethods;

public class Dispatcher {
    public static void main(String[] args) {
        Girl girl1 = new Girl();
        Girl girl2 = new Girl();

        girl1.name = "Mary";
        girl1.hairColour = "blond";

        girl2.name = "Lucy";
        girl2.hairColour = "brown";

        girl1.paint("black");

        System.out.println(girl1.name + " " +girl1.hairColour);

      //  SaloonCosmetic sc = new SaloonCosmetic();
        SaloonCosmetic.paint(girl2, "rudy");

        System.out.println( girl2.name + " " +girl2.hairColour);



    }
}

