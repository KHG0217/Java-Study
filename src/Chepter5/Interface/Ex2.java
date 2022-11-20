package Chepter5.Interface;

public class Ex2 {
    public static void main(String[] args) {

        Car c = new Car();
        c.start(); // 인터페이스는 하위 클래스에서 특정 메서드를 강제할 목적으로 사용이 가능하지만
        c.speed();
        Vehicle.stop(); // 클래스간의 의존성을 감소시킬 목적으로 상요하기도 한다.

        // 객체생성불가
        // A a = new A();

        // 다형성
        A a2 = new My();

    }
}
