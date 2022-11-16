package Chepter4;
    /*
    *   상속(Inheritance)
    *   -> 객체들 간에 is a 관계가 성립되면 자바의 상속기법을 적용시킬 수 있다.
    *   자바 상속의 특징은 다음과 같다.
    *       1. 객체 간에 is a 관계가 성립되어야 한다.
    *       2. 부모클래스의 멤버(인스턴스 변수, 메서드)를 자식클래스가 선언 없이 사용 가능하다.
    *       단, 부모 멤버중 private로 지정한 멤버와 생성자는 상속이 불가능하다.
    *       3. 자바는 단일 상속만 지원한다.
    *       4. 상속을 UML 표기법으로 사용한다 (실선을 이용한 삼각형)
    *       5. 상속을 자바코드에선 extends 키워드로 표현한다.
    *       6. API 및 사용자가 만든 클래스들은 모두 상속 관계인 계층구조로 되어있다.
    *       가장 상위에 있는 클래스는 java.lang.Object 클래스이며, 최상위 클래스락 부른다.
    *       따라서 모든 클래스는 Object 클래슬르 자연스럽게 상속받는다.
    *
    *       형식
    *       public class 자식클래스 extends 부모클래스 {}
    *
    *       * super 키워드
    *
    *         1. 부모클래스의 멤버와 자식클래스의 멤버가 동일한 경우 부모클레스의 멤버를 부를때
    *
    *         2. 자식클래스에서 명시적으로 부모 클래스를 호출하는경우 !
    *
    *           => 부모클래스의 생성자가 인자값이 요구되는 생성자이고 자식클래스에서 상속받을땐
    *           자식클래스 생성자 첫 라인에 반드시 super 메소드를 통해 호출한다.
    *           자세한 내용 : super_1 , supeR_extends
    *
    * */
public class Inheritance {
}
