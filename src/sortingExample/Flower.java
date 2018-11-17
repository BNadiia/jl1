package sortingExample;

import java.util.Comparator;

public class Flower implements Comparable {

    protected static class ComparatorByLength implements Comparator {

        public int compare(Object o1, Object o2) {
            return ((Flower) o2).length - ((Flower) o1).length;
        }

    }
    String type, colour;
    int length, price;

    public Flower() {
    }

    public Flower(String type, String colour, int length, int price) {
        this.type = type;
        this.colour = colour;
        this.length = length;
        this.price = price;
    }

    public String toString() {
        return this.type + " " + this.colour + " " + this.length + " " + this.price;
    }

    public int compareTo(Object o) {
//        return this.price - ((Flower)o).price;
//        return ((Flower)o).length - this.length;     //descending order
//        return this.type.compareTo(((Flower)o).type);
//        return this.colour.compareTo(((Flower)o).colour);

        int result = this.type.compareTo(((Flower) o).type);
        if (result != 0) return result;
        else {
            result = ((Flower) o).length - this.length;
            if (result != 0) return result;
            else {
                return this.price - ((Flower) o).price;
            }
        }


    }


}

// -> type -> colour -> length -> price
// price



//Car: String model, color; int speed, price;
//"1" -> price
//"2" -> speed (desc)
//"3" -> colour
//"4" -> model
//"other" || "nothing" -> model -> price -> speed-> colour



