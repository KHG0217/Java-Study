package Chepter3;

public class Class {
    String name;
    // 자바에서는 모든 객체가 클래스로 정의되어지며, 가장 작은 실행단위이다.

    /*
    *   지정자 class 클래스명 {
    *
    *   [ 인스턴스 변수 정의]
    *   [ 메서드 정의]
    *   [ 생성자 정의]
    *
    *   }
    *    - 지정자 : 특정 목적을 위해서 사용하는 키워드를 의미
    *       1. 두가지
    *       - 일반 지정자 (modifier) : static, final, abstract
    *
    *       - 접근 지정자(access modifier) : private , protectec, (defualt), public
    *
    *       2. 특징
    *           1. 일반 지정자와 저근 지정자는 같이 사용가능하다.
    *
    *       3. 구성요소
    *           1. 인스턴스 변수 - 클래스의 구성요소인 속성값을 저장하기위한 수단
    *           2. 메서드 - 인스턴스 변수에 저장된 속성 값을 수정하거나, 조회 또는 다양한 기능 처리및 중복처리 담당
    *           3. 생성자 - 인스턴스 변수를 초기화하는 역활
    *                    - 메서드를 이용해서 변수 초기화를 할 수도 있지만, 생성자를 이용해서 초기화 작업을 하며,
    *                      메서드는 데이터 값을 수정할 못적으로 사용된다.
    *
    *
    *
    *           - 인스턴스 변수
    *           -> 클래스를 통해서 객체 생성된 인스턴스에 필요한 데이터를 저장하는 곳(멤버변수)
    *
    *
    *           - 메서드 (method)
    *           -> 클래스의 기능적인 면을 표현할 때 사용하고, 일반적으로 인스턴스 변수에 저장된 데이터를
    *           수정,조회, 및 중복코드 처리시 사용하는 용도
    *
    *           * 인자 (argument) - 매서드 호출시 전달하는 값을 의미
    *           * 매개변수(parameter) - 메서드 호출시 전달되는 인자값을 저장하는 변수를 의미
    *
    *               1. caller 메서드
    *              -> 특정 동작을 수행하는 메서드, 호출할 때 메서드명이 일치하지 않거나 인자 리스트가 틀린경우에 에러
    *               * 인자리스트 - 인자의 개수, 데이터 타입, 인자의 순서를 의미
    *
    *               2. worker 메서드 (callee 메서드)
    *              -> caller 메서드에 의해 호출되어 실제로 특정 작업하는 메서드
    *
    *               worker 메서드는 역활에 따라 다음 2가지로 구분된다
    *                   1. Setter 메서드
    *                   -> 인스턴스 변수에 저장된 데이터를 수정할 목적으로 사용됨
    *
    *                   2. Getter 메서드
    *                   -> 데이터를 조회할 목적으로 사용됨
    *
    *                   3. 생성자
    *                   -> 인스턴스 변수를 초기화하는 역활
    *                   [접근지정자] 클래스명 (){}
    *
    *                   ex) public class Student(){
    *                       String name;
    *                       * public Student(){} <- 생성자가 자동으로 생성
    *                   }
    *
    *                   -> 명시적으로 생성되면 자동생성 x
    *
    *                   ex) public class Student(){
     *                       String name;
     *                      // 명시적 생성자 지정
     *                      public Student (String n){
     *                          name = n;
     *                      }
     *                   }
    *
    *
    *
    *
    *
    * */


    public Class(String n){
        name = n;
        System.out.println("생성자호출 : " + n);
    }

    public String getName(){
        return  name;
    }

    public void setName(String useName){
        this.name = useName;
    }

    public static void main(String[] args) {
        Class a = new Class("김혁규");
        System.out.println(a);
        a.setName("김아무개");
        System.out.println(a.getName());
    }

}
