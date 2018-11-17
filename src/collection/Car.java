package collection;

public class Car implements  Comparable<Car>{
    int price;

    public Car() {}

    public Car(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        return this.price = o.price;
    }
}
