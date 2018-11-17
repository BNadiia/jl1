package polymorphism1;

public class Dispatcher {
    public static void main(String[] args) {
        int x = 10;
        double y = x;

        Animal a = new Animal();
        Dog d = new Dog();

//        a = d;
//        d = a;

        Animal a1 = new Dog();             //polymorphism 1 type, assignment

        a.say();
        a1.say();

        Object s = "Serg";
        System.out.println(s);  //s.toString();

        System.out.println(a.x);
        System.out.println(a1.x);

        Animal a2 = new Tax();
        Dog d2 = new Tax();

        System.out.println(a2.x);  //10
        System.out.println(d2.x);  // 20

        System.out.println(d.z);   //40
//        System.out.println(a1.z);

    }
}



//Поліморфне посилання завжди викликає перевизначений метод підкласу.
//Поліморфне посилання завжди звертаєтья до поля суперкласу, якщо в підкласі є поле з такою ж назвою.
//Поліморфні посилання не можуть звертатись до елементів, що введені в підкласі.

