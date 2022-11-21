package Chepter5.Nestedclass;

public class Outer {
    int a = 10;
    private int b = 20;
    static int c = 30;

    class Inner {
        int d = 40;

//        static int e = 50; // static 사용 불가능
        public void print(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);

        }
    } // end Inner
    public void info(){
        Inner inner = new Inner();
        inner.print();
    }
}
