package Chepter3;

public class Package {
    // package 패키지명1; 단일 패키지 형태
    // package 패키지명1.패키지명2; 서브 패키지 포함 형태

    /*
     *   package를 사용할 때의 유의할 사항이다.
     *       1. 패키지문은 반드시 한번만 사용 가능
     *       2. 클래스 선언보다 먼저 선언되야함
     *       3. 패키지명은 계층구조를 가질 수 있다.
     *       4. 패키지명이 중복되면 식별이 불가능하기 때문에 안된다. 유일한 값은 도메인형식으로 지정해야함
     *       5. 패키지가 다른 클래스는 기본적으로 접근 불가능
     *       6. JDK에서 제공해준 API도 패키지명으로 API 패키지명은 사용이 불가능하다. 따라서 JAVA로 시작하는 패키지명은 사용할 수 없다.
     * */

    // 패키지 컴파일 파일 실행하기
    // javac -d 클래스파일저장경로 패키지명.클래스파일.java
    public static void main(String[] args) {
        System.out.println("hi");
    }
}
