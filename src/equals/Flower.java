package equals;

public class Flower {
    String sort, color;
    int lenght;

    public Flower() {}

    public Flower(String sort, String color, int lenght) {
        this.sort = sort;
        this.color = color;
        this.lenght = lenght;
    }

    public String toString() {
        return "Flower{" +
                "sort='" + sort + '\'' +
                ", color='" + color + '\'' +
                ", lenght=" + lenght +
                '}';
    }

    public boolean equals(Object o){
        return this.sort.equals(((Flower)o).sort) &
                this.color.equals(((Flower)o).color) &
                this.lenght == ((Flower)o).lenght;
    }


}
