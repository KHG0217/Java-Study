package Chepter5.Nestedclass;

public class Ex {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.info();

        Outer.Inner inner = outer.new Inner();
        inner.print();
    }
}
