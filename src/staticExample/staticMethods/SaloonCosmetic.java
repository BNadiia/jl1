package staticExample.staticMethods;

public class SaloonCosmetic {

    static  void paint(Girl girl, String colour){
        System.out.println("Preliminary handling");
        girl.hairColour = colour;
    }
}
