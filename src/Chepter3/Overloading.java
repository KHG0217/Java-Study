package Chepter3;
// 메서드 및 생성자 오버로딩

// 하나의 클래스 안에서 사용되는 식별자는 이름이 중복되면 안됨
// 하지만 변수의 이름은 코드블록이 서로 다르면 중복이 가능하다.
public class Overloading {
    // 코드블록을 이용한 변수이름 동일하게 지정하기

    int num = 5; // 인스턴스변수, 힙영역에 생성

    public void methodA(){
        int num = 4; //로컬변수, 스택영역 저장
        System.out.println("methodA : "+ num);
    }

    public static void main(String[] args) {
        int num = 3;

        System.out.println("main : " + num );




    }
    // 오버로딩 메서드 및 생성자를 작성하기 위한 규칙
    /*
     *   오버로딩 메서드 및 생성자를 작성하기 위한 규칙
     *
     *   1. 메서드 및 생성자 이름이 같아야 한다
     *   2. 인자 리스트는 반드시 달라야 함
     *   3. 리턴타입은 달라도 무방함
     *
     * */

    // 오버로딩 메소드들
    public void sum (){};
    public void sum(int a){};
    public void sum(String b){};
    public void sum(int a, String b){};
    public void sum(String a ,int b) {};

    // 갯수가 다르거나 , 타입이 다르거나, 순서가 다르거나

    // 오버로딩 생성자
    public Overloading(){};
    public Overloading(int a){};
    public Overloading(String b){};
    public Overloading(int a, String b){};
    public Overloading(String a ,int b){};

}
