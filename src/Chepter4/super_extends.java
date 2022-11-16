package Chepter4;

public class super_extends extends super_1{

    public super_extends(String name) {
        super(name); // 반드시 첫라인에서 호출한다.
        // 이유는 name의 변수가 super_extends의 클래스가 아닌 super_1에서 선언된 변수이기 때문에
        // 선언된 곳에서 초기화 작업을 하기 위한 목적이다.

    }
}
