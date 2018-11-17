package composition;

public class Dispatcher {
    public static void main(String[] args) {
        Piston p = new Piston();
        p.diameter = 26;

        Diesel d = new Diesel();
        d.myPiston = p;

        Engine e = new Engine();
        e.myDiesel = d;

        Car c = new Car();
        c.myEngine = e;

        System.out.println(c.myEngine.myDiesel.myPiston.diameter);





    }
}
