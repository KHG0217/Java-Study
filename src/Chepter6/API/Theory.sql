1. Scanner API
    - 키보드로부터 데이터를 입력받기 위한 방법

        Scanner scan = new Scanner(System.in);

        주요 메소드
            - next() - 문자열을 공백 기준으로 한 단어씩 반환
            - nextLine() - 한 줄 전체를 반환
            - nextint() - int 값으로 받아서 반환
            - nextDouble() - double 값으로 받아서 반환
            - nextBoolean() - boolean 값으로 받아서 반환
            - close() - 자원 반납

2. StringTokenizer API
    -   java.util.String.Tokenizer는 문자열을 특정 구분자로 분리할 수 있는 클래스
        String 클래스의 split() 메서드와 매우 비슷한 기능을 제공한다 기본 구분자는 공백이다.

    -   생성자의 첫 번째 인자값으로 문자열을 설정하고, 두 번째 값으로 구분자를 지정하면 된다.
        두 번째 구분자가 생략되면 기본 구분자인 공백을 기준으로 분리한다.

        StringTokenizer st = new StringTokenizer("홍길동,이순신,유관순",",");

3. Arrays API 활용한 고급 배열 처리

    주요 메서드
        Arrays.copyOf() - 배열을 복사하여 반환
        Arrays.fill() - 특정값으로 배열을 채움, start 와 end 지정 가능
        Arrays.equals() - 배열값이 동일한지 비교하여 boolean 으로 반환
        Arrays.sort() - 배열을 정렬해서 반환, 기본은 오름차순이고 Compartor 인터페이스를 사용하여 사용자 클래스 정렬 가능
        Arrays.toString() - for문 대신에 사용 가능한 배열 출력 방법
        Arrays.binarySearrch() - 특정 배열 요소의 인덱스 반환