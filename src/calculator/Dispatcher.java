package calculator;

public class Dispatcher {
    public static void main(String[] args) {
        int a = 90;                       //primitive

        Model m1 = new Model(50, 8);           // object of class
        Model m2 = new Model(36, 25);

//        m1.x = 50;
//        m1.y = 8;
//
//        m2.x = 36;
//        m2.x = 25;

        Controller controller = new Controller();
        int sum = Controller.add(m1);

        View view = new View();
        view.printInt(sum);

        int sub = Controller.substract(m2);
        view.printInt(sub);


        //14*22
        //59/13
        //ст 141-153









    }
}
