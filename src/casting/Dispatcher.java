package casting;

public class Dispatcher {
    public static void main(String[] args) {
        int x = 10;
        double y = 20.0;
        double z = x;             // double z = (double)x;  implicity casting
        int a = (int) y;           // explicity casting or not -> compile error
        double b = 3000000000.0;
        int c = (int) b;          //crush mistake
        System.out.println(c);

        ///////////////////////////////////////

        Animal a1 = new Animal();        // no casting
        Animal a2 = new Dog();           //Animal a2 = (Animal) new Dog();
        Animal a3 = new Cat();           // Animal a3 = (Animal) new Cat();

        if (a1 instanceof Dog) {
            Dog d1 = (Dog) a1;   //RE ?
            System.out.println("a1");
        }
        if (a2 instanceof Dog) {
            Dog d2 = (Dog) a2;    // ?
            System.out.println("a2");
        }
        if (a3 instanceof Dog) {
            Dog d3 = (Dog) a3;   // ?
            System.out.println("a3");
        }

        Animal a4 = new Poodle();
        if (a4 instanceof Dog) {
            Dog d4 = (Dog) a4;
            System.out.println("a4");
        }


        //1 Animal a10 = new Dog();                // CE- RE-
        //2 Dog d10 = new Poodle();                // CE- RE-
        //3 Poodle p10 = d10;                      // CE+ RE
        //4 Cat c10 = new Sphinks();               // CE- RE-
        //5 c10 = (Cat)a10;                        // CE- RE+
        //6 Sphinks s10 = (Sphinks) new Animal;    // CE- RE+
        //7 Dog d11 = (Poodle)a10;                 // CE- RE+


    }
}
//Коли в присвоєнні задієні 2 змінні різних типів, кастинг обов'язковий.

//Коли "вузьке" записується в "широке" кастинх відбувається неявно(implicity).

//Коли "широке" записується у "вузьке" кастинг повинен записуватися явно(explicity), інакше помилка компіляції.

//Explicity кастинг з "широкого" до "вузького" усуває помилку компляції (compile error), проте може призвести до:
//      - для примітивів до катастрофічної помилки (3000000000 - 2000000000);
//      - для об'єктних змінних до помилки під час виконання програми (runtime exception).

//Runtime error не формується тоді і тільки тоді, коли explicity робиться з поліморфним посиланням, в правій частині
//                                      якого тип об'єкту співпадає з типом кастингу або є підкласом від типу кастінга.
