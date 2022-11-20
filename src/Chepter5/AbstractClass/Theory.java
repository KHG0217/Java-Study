package Chepter5.AbstractClass;
/*
    객체지향 특징인 재상용성 및 유지보수를 향상시키기 위해서 하위 클래스에서
    반드시 부모 클래스의 매서드를 사용하게끔 강제할 필요성이 등장하게 되며
    자바에서는 인터페이스와 추상클래스를 통해서 하위 클래스들에게 부모의 메서드를
    반드시 사용하도록(오버라이딩) 강제할 수 있다.

        * 강제성이 필요한 이유
            1. 통일성 및 일관성이 지켜질 수 있으며, 결국에 재사용성 및 유지보수가 향상되고 관리도 쉬워짐.
            2. 통일된 하나의 메서드로 처리하는 것이 관리차원에서도 효율적이라고 할 수있다.

 */
public class Theory {
    /*
        1. 추상 클래스 (abstract class)
            블록{} 이 없는 메서드를 포함할 수 있는 클래스를 추상클래스 라고 한다.
            블록이 없는 메서드를 추상 메서드(abstract method) 라고 하며 abstract 키워드를 사용하여 표현

            public abstract 리턴타입 메서드명(파라미터);

            1. 특징
                1. 미완성 클래스이다 *
                2. 구성요소는 다음과 같고 반드시 추상 메서드를 포함할 필요는 없다.
                    - 인스턴스 변수 (instace variable)
                    - 일반 메서드 (concreate method)
                    - 생성자 (constructor)
                    - 추상 메서드 (abstract method)

                3. 추상 메서드를 포함할 수 있기 때문에 객체생성이 불가능하다.
                4. 불완전한 추상클래슬르 사용하기 위해선, 일반 클래스를 사용한다.
                5. 상속을 이용하고 다형성 적용도 가능하다.
                !! 주의할 점은 하위 클래스에서 반드시 추상 클래스의 추상 메서드를 재정의(오버라이드) 해야 한다.

                6. 추상 클래스도 클래스이기 떄문에 단일상속만 지원한다.
                7. 추상 클래스와 추상 메서드의 UML표기법은 이탤릭체로 표기한다.
                8. 객체 생성은 불가능 하나 선언된 변수의 데이터형으로 사용할 수 있다.
                9. 강제성 및 통일성을 제공한다. 하위 클래스에게 특정 메서드만 강제할 수 있다.

     */
}