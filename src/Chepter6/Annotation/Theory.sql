어노테이션
    -> 컴파일러가 검증할 때 필요한 부가 정보 및 메타 데이터를 쉽게 활용할 수 있도록
    JDK 5.X 버전에서 추가된 기능이다.
    명시적으로 자바코드에 @시작하는 문자열을 사용하여 설정한다.
    자바코드에서 어노테이션을 설정 가능한 곳은 클래스,변수,메서드에 설정할 수 있다.
    각각 클래스 레벨, 변수 레벨, 메서드 레벨이라고 부른다.

        기본적인 어노테이션
            @Override 어노테이션 - 해당 메서드가 부모 클래스를 오버라이딩 한다는 정보를 알려줌
            @Deprecated 어노테이션 - 과거 버전이 사용되었으나 향상된 기능이 추가되어 현재는 사용하지 않도록 알려준다
            @SuppressWarning 어노테이션 - 컴파일러에게 경고정보를 표시하지 않도록 알려준다.