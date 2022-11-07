package Chepter3;

public class This {
    // 힙 메모리에 생성된 '자기 자신의 인스턴스'를 의미한다.

    String name; //인스턴스 변수
    int age;

    // 생성자에서 다른 오버로딩 생성자를 호출하는 경우

    // this([값]) 형식으로 사용, 반드시 생성자 첫 라인에서 사용해야 되며, 인자 리스트가 반드시 일치해야함

    // 나이가 19인 학생들을 가리하기위해 이름만 설정해도 자동으로 나이가 19로 코드 초기화
    public This(String name){
        this(name, 19);
    }

    public This(String name, int age){
        this.name = name;
        this.age = age;
    }


//    public void This(String name){ // 로컬변수
//        this.name = name;// this를 이용해서 인스턴스 변수를 가르킨다.
//
//    }

}
