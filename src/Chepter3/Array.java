package Chepter3;



public class Array {
    // 배열 - 단 하나의 변수로 데이터 관리 가능
    /*   특징
    *       1. 기본 데이터형 및 참조 데이터 형을 포함한 자바의 모든 데이터 타입을 배열로 저장할 수 있음
    *       2. 같은 데이터 형만 배열로 저장 가능
    *       3. 하나의 배열명을 이용하여 관리, 배열의 각 요소 접근은 인덱스를 사용함 0부터 시작 = 위치값을 의미
    *       4. 배열의 크기는 length 를 사용하여 구한다.
    *       5. 일차원 - 다차원 배열 모두 가능
    *       6. 배열은 반드시 선언과 생성작업이 필요함
    *       7. 배열은 객체이기 때문에 기본적으로 new 키워드를 사용하여 생성해야 함
    *       8. 배열이 생성되면 기본적으로 지정한 데이터형에 맞는 기본값으로 초기화됨
    *
    *   생성 방법
    *       1. new 키워드 이용
    *       2. 리터럴 이용
    *       3. new 키워드와 리터럴 혼합
    *
    *   배열 생성
    *       배열명 = new 데이터형[크기];
    *       데이터형 [] 배열명 = new 데이터형[크기];
    *
    *   배열 초기화
    *       배열명[인덱스] = 값;
    *
    *   배열 크기
    *       배열명.length;
    *
    * */

    public static <Books> void main(String[] args) {

        int[] num;
        num = new int[4];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        for (int i =0 ; i < num.length; i++){
            System.out.println("배열 값 : " + num[i]);
        }



        /*
            for-each 반복문

         -> for-each 반복문은 조건식을 사용하지 않고, 배열명만을 사용하기 때문에
            인덱스를 잘못 사용해서 예외가 발생될 위험 제거 가능

            배열에 저장된 데이터 형과 변수의 데이터 형은 일치되어야 한다.

            향상된 for문 = 자동으로 배열에 하나의 값을 가져와서 변수에 저장시킨다. <- 자동으로 배열의 길이만큼 반복처리

        *   for( 데이터형 변수 : 배열명) {
        *       // 변수 출력
        *   }
        */

        String [] name;
        name = new String[4];

        name[0] = "홍길동1";
        name[1] = "홍길동2";
        name[2] = "홍길동3";
        name[3] = "홍길동4";

        for (String a : name){
            System.out.println(" 문자열 배열값 :" + a);
        }

        // 리터럴을 이용한 배열 생성
        int [] num2 = {1 , 2, 3, 4};

        // int [] num3;
        // num3 ={ 1, 2, 3}; //에러

        // 리터럴을 이용한 이차원 배열 생성

        String [][] names ={
                {"홍길동","홍길동1"},
                {"홍길동3"}
        };

        for (int i =0; i < names.length; i++){
            for (int j=0; j < names[i].length; j++ ){
                System.out.println("names["+i+"]["+j+"] = " +names[i][j]);
            }
        }

        /*
            파라미터로 배열 전송
                -> 메서드의 파라미터로 배열을 전달할 경우에는
                배열도 객체이기 때문에
                배열의 위치값이 전달된다.
                따라서 넘겨받은 곳에서 배열의 요소를 수정하면
                원래의 배열도 수정된다.
                이것을 call by value reference 라고 부르며 매우 중요한 개념이다.
        */

        int [] num3 = { 1, 2, 3, 4};
        System.out.println("원래 배열");
        for (int i : num3){
            System.out.println(i);
        }

        change(num3); // change 라는 메서드를 호출해서 배열을 전달한다.
                      // 배열도 객체이기 때문에 배열의 위치값이 전송된다.
                      // 이때 주의할 점은  change(num3)의 num3 변수와 private static void change(int[] num3)의 num3 변수는 서로 다른 변수이다.
                      // 단지 이름이 같고 동일한 배열객체를 참조한다.

        System.out.println("수정된 배열");
        for (int i : num3){
            System.out.println(i); // 위치값이 이동했기 때문에 넘겨받은 곳에서 배열을 수정하면 원래 배열도 수정된다.
        }

        // System.arraycopy 메서드를 이용한 배열 복사
        // 한번 생성한 배열의 크기는 변결할 수 없기 때문에,
        // 새로운 배열을 생성해서 이전 배열을 새로운 배열에 복사 사용해야한다.

        /*
        *   Sysyem.arraycopy( Object src, int srcPos, Object dest, int destPos, int length);
        *   = src배열의 srcPos 인덱스부터 시작 하여 length크기만큼을
        *     dest배열의 destPos 인덱스를 시작위치로 설정하여 복사함
        * */

        int [] source = { 1, 2, 3, 4, 5, 6};
        int [] destination = {10, 9, 8, 7, 6, 5, 4,3, 2, 1};

        System.arraycopy(source,0, destination,0, source.length);

        for (int u : destination){
            System.out.println(u); // 1, 2, 3, 5, 6, 4, 3, 2, 1
        }

    }

    private static void change(int[] num3) {
        num3[0] = 100;
    }
}
