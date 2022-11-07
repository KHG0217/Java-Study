package Chepter3;


final class Final {
    // 자바에서는 변경되는 것이 마지막이라는 용도로 사용된다. 즉 금지

    // final 키워드를 사용하면 다음과 같은 특징을 갖는다.
        /*
        *   1. 클래스에 사용하면 상속이 불가능하다. 대표적인 클래스가 java.lang.Math이다.
        *
        *   2. 변수에 사용하면 값 변경이 불가능하다. 따라서 상수가 되며 변수와 구별하기 위해서
        *      일반적으로 대문자로 표현한다
        *   3. public static final 데이터형 상수 = 값;
        *
        * */

    public static void main(String[] args) {
        System.out.println(C.NUM);
    }
}

//class AA extends Final{} final 지정자로 정의된 클래스는 상속이 불가능하다.
class A {
    public final void print(){}
}

class B extends A {
    //public void print(){} // final 지정자로 정의된 메서드는 오버라이딩이 불가능하다.

}

class C {
    public static final  int NUM = 100;
}



