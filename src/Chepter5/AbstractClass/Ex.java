package Chepter5.AbstractClass;

public class Ex {
    public static void main(String[] args) {

        MyClassImpl imp = new MyClassImpl();
        imp.print();
        imp.methodB();

        // 추상클래스는 불완전 클래스이기 때문에 객체생성 불가능
        //MyClass my = new MyClass();

        // 다형성을 적용하여 변수타입으로 추상클래스를 사용할 수 있음
        MyClass my = new MyClassImpl();
    }
}
