package finalExample;

public class Dispatcher {

    int a;   // int a = 0;
    final static int B = 10;
    final int birthDate;

    public Dispatcher(int birthDate) {
        this.birthDate = birthDate;
    }

    final int c = (int)(Math.random()*100);

    public static void main(String[] args) {
        final int x = 10;
//        x++;

        final Parent p = new Parent();
        p.y++;
        Parent p1 = new Parent();
//        p = new Parent();

        final Car myCar = new Car();
//        myCar = new Car();
        Car myCar1 = new Car();


        Dispatcher d1 = new Dispatcher(04);

        Parent pr = new Child();
//        pr.display();
        Parent.m();

        Child cd = new Child();
        Child.m();
        cd.display();




    }
}
//Ключове слово final має 4 особливості використання:
//      з методами, з класами, з примітивними змінними і з об'єктними змінними

//Final класи не можна наслідувати
// Також не можна final методи - перевизначати, final змінні  - змінювати

//Final змінні примітивні і об'єктні можуть  ініціалізовуватись:
//      - під час компіляції(для final static змінних), (якщо final змінна оголошугється одразу, то вона стає static)
//      - конструктором під час виконання програми,
//      - методом під час виконання програми

// приклад ст 189 Еккель

//Статичні методи не перевизначаються
//Поліморфні посилання викликають статичні методи супер класу
//Статичні методи викликаються через клас


//Приватні методи також не перевизначаються