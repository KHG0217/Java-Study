package Chepter5.Nestedclass;

import java.util.Comparator;

/*
    사용자 정보가 저장된 Person 클래스를 배열에 저장하고
    age 변수를 기준으로 정렬하는 실습
    Comparator 인터페이스 활용
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}// end Person

    class PersonComp implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {

            int result = 1;
            if(o1.age >= o2.age)
                result = -1; //내림차순 result =1 <- 오름차순
            return result;
        }
    }

