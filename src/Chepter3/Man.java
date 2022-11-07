package Chepter3;
// this 라는 키워드 사용하기
public class Man {
    String name;
    int age;

    public Man(String name){
        this(name, 19);
        System.out.println("Person 생성자1");
    }

    public Man(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Person 생성자2");
    }

    public String getName(){
        return  name;
    }
    public int getAge() {
        return age;
    }

}

