package birds;

public class Dispatcher {
    public static void main(String[] args) {
        Hawk h = new Hawk();
        Strauss s = new Strauss();
        Penguin p = new Penguin();
        Crocozjablic c = new Crocozjablic();
        Bird[] b = new Bird[4];
        b[0] = h;
        b[1] = s;
        b[2] = p;
        b[3] = c;
        for (Bird temp:b) {
            temp.move();
        }
    }
}




