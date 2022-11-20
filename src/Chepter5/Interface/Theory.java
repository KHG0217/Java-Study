package Chepter5.Interface;
/*
    추상 클래스와 비슷한 용도로 인터페이스를 사용할 수 있다.
    다음과 같이 interface 키워드를 사용하고 4가지 구성요소를 포함할 수 있다.

    public interface 인터페이스명 {

        public static final로 지정한 상수
        public abstract 지정자를 이용한 추상메서드
        public default 지정자를 이용한 일반메서드
        public static 지정자를 이용한 일반메서드

    }
 */
public class Theory {

    /*
        1. 특징
            - 구성요소는 상수 및 추상메서드, default 메서드 , static 메서드만 가질 수 있다.
            - 상수는 public static final 지정자를 사용하며 추상 메서드(abstract method)는
            public abstract 지정자를 사용한다.
            - 추상클래스와 다르게 인터페이스의 추상 메서드는 abstract 키워드를 생략 할 수 있으나 지정하는걸 권장
            - default 메서드와 static 메서드는 블록을 포함한다.
            - 추상 메서드를 가지고 있기 때문에 객체생성 불가능, 상속과 비슷하게 구현(implement)을 이용하며 다형성 적용 가능
            - 클래스는 단일 상속만 지원되지만, 인터페이스는 다중 구현을 지원한다.
            - 인터페이스 간에도 extends 키워드를 이용해서 상속이 가능하다.
            - 객체 생성은 불가능하지만 변수의 데이터형으로 사용할 수 있다.
            - 강제성 및 통일성 제공
            - 인터페이스의 UML 표기법은 <<interface>> 으로 표현한다.
            - 추상 메서드의 UML표기법은 이탤릭체로 표현
            - 구현을 UML 표기법으로 ↑ 을 이용한다  (점선의 삼각형)

     */
}
