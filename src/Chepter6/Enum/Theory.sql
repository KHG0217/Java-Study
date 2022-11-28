Enum - 열거형 상수
    -> 데이터가 몇 개의 한정된 상수값으로 구성될 때 주로 사용된다.
    이전에는 public static final로 지정된 일반적인 상수를 사용하였으나
    값 충돌 밒 논리적인 문제점이 발생되어 enum으로 대체되어 사용된다.

    * 열거형 상수는 컴파일 단계에서 에러가 발생되기 때문에 개발단계에서 상수가 잘못 설정되었음을 알 수 있다.
    public enum 열거형데이터형 {상수값,상수값,상수값};
    ex) public enum Colors {RED,BLUE,GREEN};
    Colors color = Colors.RED;