package Chepter4;

public class Ex06_2 {
    public static void main(String[] args) {
        Man man = new Man();
        // Man 의 부모 클래스가 Emp이기 떄문에 생성자가 같이 호출 되는것을 알 수있다.

        // Man 객체 요청 -> 부모 생성자 자동 호출 -> 1. Object 생성 -> 2. Emp 생성 - 3. Man 생성
    }
}
