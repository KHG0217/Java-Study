package Chepter5.Nestedclass;

public class Ex4 {
    public static void main(String[] args) {
        Flyer f = new Flyer() { // 원래는 인터페이스에서 객체생성이 안됨

            @Override // 익명 클래스
            public void takeOff() {

            }

            @Override // 익명 클래스
            public void fly() {
                System.out.println("fly");
            }

            @Override // 익명 클래스
            public void land() {

            }
        }; // 반드시 세미클론을 붙여준다.
        f.fly();
    }
}
