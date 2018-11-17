package anonymous;

public class Dispatcher {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.say();

        Dog d = new Dog();
        System.out.println(d.x);

        Animal a2 = new Animal(){
            public void say() { System.out.println("Wow"); }
        };
//        System.out.println(a2.y);
        a2.say();

        Animal a3 = new Animal(){
            public void say() { System.out.println("Wow"); }
        };

        I1 i = new I1(){
            public void m(){}
        };

    }
}
//Анонімний клас породжує тільки один об'єкт.
//Анонімний клас може мати лише одного батька.
//В анонімних класах немає потреби оголошувати щось нове, використовуються виключно поля батька.