package inner;

public class Dispatcher {
    public static void main(String[] args) {
        Outer o = new Outer(200);
//        Outer.Inner oi = o.new Inner();     //for regular inner class
        Outer.Inner oi = new Outer.Inner();     //for  static inner class
        oi.display();
    }
}

//Якщо якийсь клас не можна використати з різними класами, а лише з одним, то його доцільно робити внутрішнім.

