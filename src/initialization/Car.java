package initialization;

public class Car {
    String model;
    int speed;
    Engine e;

    public Car(String m, int s, Engine en) {
        model = m;
        speed = s;
        e = en;
        System.out.println("Inside Car");
    }
}
