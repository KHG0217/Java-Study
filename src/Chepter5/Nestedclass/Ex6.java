package Chepter5.Nestedclass;
import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("이순신", 44);
        Person p3 = new Person("강감찬", 66);
        Person p4 = new Person("유관순", 18);
        Person p5 = new Person("김혁규", 27);
        Person [] ps = {p1, p2, p3, p4, p5};

        // age로 정렬
        Arrays.sort(ps, new PersonComp());
        for(Person person : ps){
            System.out.println(person);
        }


    }
}
