1. String API
    1. 기본 API
        length - 문자열 길이
        equals - 문자열이 일치하는지 검사
        equalsIgnoreCase - 대소문자 구별없이 문자열이 일치하는지를 검사
        substring - 부분열을 구함
        replace - 문자열 치환
        toUpperCase - 대문자로
        toLowerCase - 소문자로
        charAt - 특정 문자 반환
        concat - 문자열을 연결
        split - 특정문자를 기준으로 문자열을 구분하여 배열로 리턴
        indexOf - 특정문자의 인덱스값을 리턴 일치하지 않으면 -1
        valueOf - 문자열이 아닌 데이터를 문자열로 변환한다.
        format - 특정 포맷에 맞는 문자열로 리턴한다.

    2.StringBuffer
    -> String 클래스는 불변성 특징을 갖기 때문에, 문자열 연산시 매우 비효율적으로 메모리를 사용하게 된다.
    -> 문자열을 이용한 연산작업이 많은 경우에는 StringBuffer 또는 StringBuilder 를 사용할 수 있다.
    -> 차이점은 StringBuffer 는 thread-safe 지만, 무겁다.
    -> StringBuilder는 thread-unsafe 하지만 성능이 좋다.
        1. 대표적인 method
            length - 문자열 길이 반환
            capacity - 초기 버퍼크기 지정
            append - 버퍼에 문자열을 추가
            * String의 concat()매서드 그리고 += 연산자 속도를 비교해보면
            -> append() > concat() > + =
            insert - 버퍼의 문자열을 삽임
            delete - 버퍼의 문자열을 삭제
            toString - StringBuffer 객체를 String 객체로 변환

    3. Wrapper Class
        -> 자바에서는 8개의 기본 데이터 타입과 동일한 값을 표현할 수 있는 8개의 클래스들을 제공하고,
        Wrapper 클래스란 이름으로 부른다.
            byte
            short
            int
            long
            float
            double
            char
            boolean
                1. 주요 method
                    Integer.parseInt() - 문자열로 된 수치데이터를 연산 가능한 데이터로 변환


