package Chepter3;

public class Student {

    String name;
    int age;

    // public Student(){} 자동 생성

    public Student(){
        System.out.println("생성자 호출");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
