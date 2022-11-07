package Chepter3;

// 핸들링 클레스 - 재사용 가능한 클래스를 사용할수 있게 도와주는 클래스
public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();

        // 변수 접근
        stu.name = "김혁규";
        stu.age = 20;

        String n = stu.name;
        int a = stu.age;

        System.out.println("이름 : " + n);
        System.out.println("나이 : " + a);

        // 메서드로 접근
        stu.setName("이순신");
        stu.setAge(30);

        System.out.println("이름 : " + stu.getName());
        System.out.println("나이 : " + stu.getAge());
    }
}
