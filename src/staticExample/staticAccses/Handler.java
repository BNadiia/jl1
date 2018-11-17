package staticExample.staticAccses;

public class Handler {
     int y =20;
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        Handler handler1 = new Handler();
        System.out.println(handler1.y);

    }
}
