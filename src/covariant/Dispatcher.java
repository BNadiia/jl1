package covariant;

public class Dispatcher {
    public static void main(String[] args) {
        PoodleCreator pc = new PoodleCreator();
//        Dog myPoodle = pc.create();         //Dog myPoodle = new Poodle();
        Poodle myPoodle = (Poodle)pc.create();


    }
}
//Перевизначений метод має право повертати будь-який підклас від типу повертання методу суперкласу