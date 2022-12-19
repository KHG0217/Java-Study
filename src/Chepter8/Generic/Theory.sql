제네릭(Generic)
    -> 컴파일 시점에서, 사용하는 데이터형을 체크하기 때문에, 프로그램의 안정성을 향상시키거나
    데이터 사용시 형변환코드가 필요하지 않기때문에 코드 사용이 간편하다는 장점이 있다.

    1. 클래스의 제네릭 타입[Box]
        클래스와 인터페이스에 제네릭이 적용된 타입을 '제네릭 타입' 이라고 부른다.
         적용하지 않은 타입을 '원시타입' 이라고 부른다.

         public class Class_Name<T>{}
         public interface interface_Name<T>{}
         T: 타입 파라미터 선언

         - 제네릭타입으로 객체 생성하거나 원시 타입으로 생성할 수 있다.
            Class_Name<String> genericType = new Class_Name<String>();
            Class_Name<String> genericType2 = new Class_Name<>();
            Class_Name rawType = new Class_Name();

    2. 클래스 제네릭의 파라미터 타입 제한[Box]
        필요시 사용 가능한 파라미터 타입을 제한 할 수 있는데, 다음과 같이 extends 키워드를 사용한다.
        public class Class_Name<T extends 타입> {}
        <T extends 타입>에 설정 가능한 타입은 해당 타입과 그 자식 클래스로 한정

    3. 메서드의 제네릭 타입 [Vehicle]
        - 제네릭선언은 메서드에서도 사용가능 메서드의 리턴타입 앞에 타입 파라미터를 지정하고
        메서드의 리턴타입 또는  파라미터로 지정할 수 있다.

        public <타입_파라미터> void 메서드명(타입_파라미터 변수명){}
        public <타입_파라미터> 타입_파라미터 메서드명(타입_파라미터 변수명){
            return 타입_파라미터;
        }

    4. 메서드에서 제네릭 타입 제한 [Group]
        <?> : 타입 제한이 없다 <? extends Object>와 동일한기능
        <? extends T> : T와 T를 상속받은 하위 클래스만 사용 가능
        <? super T> : T와 T의 부모 클래스만 사용가능
