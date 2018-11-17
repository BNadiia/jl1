package thisExample;

public class Car {
    String model;
    int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }
}


// В середині нестатичного метода this це є посилання на об'єкт, який викликає цей метод
// В середині конструктора this це є посилання на об'єкт, який створюється
// В середині статичних методів використання this викликає помилку компілятора