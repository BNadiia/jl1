package inner;

public class Outer {
    public static class Inner {      // static inner class -> nested class
//    public class Inner {                   //regular inner class
        int y = 20;

        public void display() {
            Outer outer = new Outer(100);
            System.out.println(outer.x);
//            System.out.println(Outer.this.x);
        }
    }

    private int x = 10;

    Outer(int x) {
        this.x = x;
    }

    public void display() {
        System.out.println(new Inner().y);
    }
}
