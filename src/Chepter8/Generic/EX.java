package Chepter8.Generic;

import java.util.Date;
import java.util.Objects;

public class EX {
    public static void main(String[] args) {

        // Box에 저장할 데이터 타입으로 String으로 한정
        Box<String> b = new Box<String>();
        b.setValue("Hello");

        String str = b.getValue();
        System.out.println(str);

        // Box에 저장할 데이터 타입으로 Date으로 한정
        Box<Date> b2 = new Box<>();
        b2.setValue(new Date());
        Date d = b2.getValue();
        System.out.println(d);

        // extends 를 이용한 파라미터타입 제한
        // Pet클래스 혹은 하위 클래스인 Cat, Dog만 가능
        Box2<Pet> c =new Box2<Pet>();
        Box2<Cat> c1 =new Box2<Cat>();
        Box2<Dog> c2 =new Box2<>();

        // 메서드의 제네릭타입
        method(new Vehicle());
        method(new Trunk());
        method(new Car());

        Vehicle v = method2(new Vehicle());
        Trunk t = method2(new Trunk());
        Car C = method2(new Car());

        // 메서드의 타입 제한

        //method3 어떤 타입도 설정 가능
        method3(new Group<Object>());
        method3(new Group<Person>());
        method3(new Group<Man>());
        method3(new Group<Woman>());
        method3(new Group<Box>());

        //method4 Person 혹은 Person 자식만 가능
        //method4(new Group<Object>());
        method4(new Group<Person>());
        method4(new Group<Man>());
        method4(new Group<Woman>());

        //method5 Person 혹은 Person의 부모만 가능
        method5(new Group<Object>());
        method5(new Group<Person>());
       // method5(new Group<Man>());
       // method5(new Group<Woman>());

    }

    public static <P> void method(P p){}
    public static <P> P method2(P p){
        return p;
    }
    public static void method3(Group<?> group){}
    public static void method4(Group<? extends Person> group){}
    public static void method5(Group<? super Person> group){}
}
