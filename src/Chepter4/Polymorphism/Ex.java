package Chepter4.Polymorphism;

import java.util.Date;

public class Ex {
    public static void main(String[] args) {
        Employee emp = new Employee("김혁규", 3000);
        System.out.println(emp.getEmployee());

        // 상속관계에서 다형성 사용
        emp = new Manager("김혁규",3000,"개발");
        System.out.println(emp.getEmployee());

        // 동적바인딩 : 실행할 당시의 객체 타입을 기준으로 실제 실행할 메서드를 호출하는 것
        Employee e = new Manager("김혁규",10000,"개발");
        String info =e.getEmployee(); // 동적바인딩
        /*
            컴파일 시점에서의 getEmployee() 는 Employee 객체의 메서드로 인식하고,
            실행 시점에서는 실제 객체를 생성한 Manager 객체의 getEmployee()가 실행된다.

            이때 주의할건 메서드에서만 동적 바인딩이 발생하고 변수에서는 발생하지 않는다.
            즉, 부모,자식에 모두 동일한 변수가 있다면, 컴파일단계와 실행단계를 구분하지 않고
            모두 부모타입의 변수로 인식한다.

            * instanceof 연산자 사용시 주의할점
             -> 계층구조를 if문으로 확인할때 하위부터(자식부터) 비교해서 검사해야함
              그렇지 않으면 모두 부모의타입으로 찾게 됨
         */

        // 다형성을 이용한 배열 관리
        Pet [] pets = {
                new Cat("나비",2,"암컷","흰색"),
                new Cat("하늘",5,"암컷","회색"),
                new Cat("야옹이",3,"수컷","검정색"),
                new Dog("백구",3,"암컷","진돗개"),
                new Dog("흑구",3,"수컷","리트리버")

        };
        for(Pet pet: pets){
            System.out.println(pet.getPet());
        }

        // toString()
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString()); // d를 호출하면 자동으로 toString()이 호출되어 콘솔에 찍힌다.

    }
}
