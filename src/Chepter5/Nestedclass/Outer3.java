package Chepter5.Nestedclass;

public class Outer3 {
    int a = 10;
    private int b = 20;
    static int c = 30;

        static class Inner {
            int d = 40;
            public void print(){
//                System.out.println(a);
//                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
            }

        } // end Inner
}
